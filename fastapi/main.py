from fastapi import FastAPI
from pydantic import BaseModel
import openai

app = FastAPI()

openai.api_key = "YOUR_API_KEY"  # OpenAI API 키 입력

class ChatRequest(BaseModel):
    message: str

@app.post("/chat")
def chat_with_gpt(request: ChatRequest):
    prompt = f"You: {request.message}\nAI:"
    response = openai.Completion.create(
        engine="text-davinci-003",
        prompt=prompt,
        max_tokens=50,
        temperature=0.8,
        n=1,
        stop=None,
        temperature=0.8
    )
    answer = response.choices[0].text.strip().replace("AI:", "")
    return {"answer": answer}

