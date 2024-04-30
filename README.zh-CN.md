# 敏感词检测

## 关于

这个仓库托管了**敏感词检测**项目，一个为文本数据中的敏感词检测和过滤设计的稳固且高效的接口。该项目的主要目标是为开发者提供一个可以轻松集成到需要内容审核的各种应用中的工具，例如社交媒体平台。该接口利用 `sensitive-word` 包进行实时检查和过滤敏感内容。

## 特性

- **实时检测**：快速识别文本中的敏感词。
- **易于集成**：设计为可以无缝集成到现有应用中。
- **可定制过滤器**：允许根据应用特定需求自定义敏感词列表。

## 入门指南

### 先决条件

- Java 11 或更高版本
- Maven 3.6 或更高版本
- Spring Boot 2.5 或更高版本

### 安装

1. **克隆仓库：**
```bash
git clone https://github.com/eddsi/sensitive.git
cd sensitive
```
2. **构建项目：**

```bash
mvn clean install
```

3.  **运行应用：**

```
mvn spring-boot:run
```

## 使用方式

要检查文本是否包含敏感词，请向 `/api/sensitive/check` 端点发送 POST 请求，并附带您想要分析的文本：

```
curl -X POST -d '"test string"' -H "Content-type: application/json" http://localhost:8080/api/sensitive/check'
```

## API 参考

### POST `/api/sensitive/check`

- **参数**：
   - `text` (string): 需要检查的文本。
- **返回值**：布尔值，指示文本是否包含敏感词。

## 贡献

贡献是开源社区成为一个令人惊叹的学习、启发和创造场所的原因之一。您所做的任何贡献都非常受欢迎。

- **Fork 项目**
- **创建您的功能分支**
- **提交您的更改**
- **推送到分支**
- **开启一个拉取请求**
