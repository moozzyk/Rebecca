// **********************************************************************
//
// Copyright (c) 2003-2007 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.2.1
// Generated from file `network.ice'

using _System = System;
using _Microsoft = Microsoft;

namespace rebecca
{
    namespace impl
    {
        public interface CallBacksIce : Ice.Object, CallBacksIceOperations_, CallBacksIceOperationsNC_
        {
        }

        public class ExceptionIce : Ice.UserException
        {
            #region Slice data members

            public string what;

            #endregion

            #region Constructors

            public ExceptionIce()
            {
            }

            public ExceptionIce(_System.Exception ex__) : base(ex__)
            {
            }

            private void initDM__(string what)
            {
                this.what = what;
            }

            public ExceptionIce(string what)
            {
                initDM__(what);
            }

            public ExceptionIce(string what, _System.Exception ex__) : base(ex__)
            {
                initDM__(what);
            }

            #endregion

            #region Object members

            public override int GetHashCode()
            {
                int h__ = 0;
                if((object)what != null)
                {
                    h__ = 5 * h__ + what.GetHashCode();
                }
                return h__;
            }

            public override bool Equals(object other__)
            {
                if(other__ == null)
                {
                    return false;
                }
                if(object.ReferenceEquals(this, other__))
                {
                    return true;
                }
                if(!(other__ is ExceptionIce))
                {
                    return false;
                }
                if(what == null)
                {
                    if(((ExceptionIce)other__).what != null)
                    {
                        return false;
                    }
                }
                else
                {
                    if(!what.Equals(((ExceptionIce)other__).what))
                    {
                        return false;
                    }
                }
                return true;
            }

            #endregion

            #region Comparison members

            public static bool operator==(ExceptionIce lhs__, ExceptionIce rhs__)
            {
                return Equals(lhs__, rhs__);
            }

            public static bool operator!=(ExceptionIce lhs__, ExceptionIce rhs__)
            {
                return !Equals(lhs__, rhs__);
            }

            #endregion

            #region Marshaling support

            public override void write__(IceInternal.BasicStream os__)
            {
                os__.writeString("::rebecca::impl::ExceptionIce");
                os__.startWriteSlice();
                os__.writeString(what);
                os__.endWriteSlice();
            }

            public override void read__(IceInternal.BasicStream is__, bool rid__)
            {
                if(rid__)
                {
                    /* string myId = */ is__.readString();
                }
                is__.startReadSlice();
                what = is__.readString();
                is__.endReadSlice();
            }

            public override void write__(Ice.OutputStream outS__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::ExceptionIce was not generated with stream support";
                throw ex;
            }

            public override void read__(Ice.InputStream inS__, bool rid__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::ExceptionIce was not generated with stream support";
                throw ex;
            }

            public override bool usesClasses__()
            {
                return true;
            }

            #endregion
        }

        public class FileNotFoundExceptionIce : rebecca.impl.ExceptionIce
        {
            #region Constructors

            public FileNotFoundExceptionIce()
            {
            }

            public FileNotFoundExceptionIce(_System.Exception ex__) : base(ex__)
            {
            }

            public FileNotFoundExceptionIce(string what) : base(what)
            {
            }

            public FileNotFoundExceptionIce(string what, _System.Exception ex__) : base(what, ex__)
            {
            }

            #endregion

            #region Object members

            public override int GetHashCode()
            {
                int h__ = 0;
                return h__;
            }

            public override bool Equals(object other__)
            {
                if(other__ == null)
                {
                    return false;
                }
                if(object.ReferenceEquals(this, other__))
                {
                    return true;
                }
                if(!(other__ is FileNotFoundExceptionIce))
                {
                    return false;
                }
                return true;
            }

            #endregion

            #region Comparison members

            public static bool operator==(FileNotFoundExceptionIce lhs__, FileNotFoundExceptionIce rhs__)
            {
                return Equals(lhs__, rhs__);
            }

            public static bool operator!=(FileNotFoundExceptionIce lhs__, FileNotFoundExceptionIce rhs__)
            {
                return !Equals(lhs__, rhs__);
            }

            #endregion

            #region Marshaling support

            public override void write__(IceInternal.BasicStream os__)
            {
                os__.writeString("::rebecca::impl::FileNotFoundExceptionIce");
                os__.startWriteSlice();
                os__.endWriteSlice();
                base.write__(os__);
            }

            public override void read__(IceInternal.BasicStream is__, bool rid__)
            {
                if(rid__)
                {
                    /* string myId = */ is__.readString();
                }
                is__.startReadSlice();
                is__.endReadSlice();
                base.read__(is__, true);
            }

            public override void write__(Ice.OutputStream outS__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::FileNotFoundExceptionIce was not generated with stream support";
                throw ex;
            }

            public override void read__(Ice.InputStream inS__, bool rid__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::FileNotFoundExceptionIce was not generated with stream support";
                throw ex;
            }

            public override bool usesClasses__()
            {
                return true;
            }

            #endregion
        }

        public class IllegalArgumentExceptionIce : rebecca.impl.ExceptionIce
        {
            #region Constructors

            public IllegalArgumentExceptionIce()
            {
            }

            public IllegalArgumentExceptionIce(_System.Exception ex__) : base(ex__)
            {
            }

            public IllegalArgumentExceptionIce(string what) : base(what)
            {
            }

            public IllegalArgumentExceptionIce(string what, _System.Exception ex__) : base(what, ex__)
            {
            }

            #endregion

            #region Object members

            public override int GetHashCode()
            {
                int h__ = 0;
                return h__;
            }

            public override bool Equals(object other__)
            {
                if(other__ == null)
                {
                    return false;
                }
                if(object.ReferenceEquals(this, other__))
                {
                    return true;
                }
                if(!(other__ is IllegalArgumentExceptionIce))
                {
                    return false;
                }
                return true;
            }

            #endregion

            #region Comparison members

            public static bool operator==(IllegalArgumentExceptionIce lhs__, IllegalArgumentExceptionIce rhs__)
            {
                return Equals(lhs__, rhs__);
            }

            public static bool operator!=(IllegalArgumentExceptionIce lhs__, IllegalArgumentExceptionIce rhs__)
            {
                return !Equals(lhs__, rhs__);
            }

            #endregion

            #region Marshaling support

            public override void write__(IceInternal.BasicStream os__)
            {
                os__.writeString("::rebecca::impl::IllegalArgumentExceptionIce");
                os__.startWriteSlice();
                os__.endWriteSlice();
                base.write__(os__);
            }

            public override void read__(IceInternal.BasicStream is__, bool rid__)
            {
                if(rid__)
                {
                    /* string myId = */ is__.readString();
                }
                is__.startReadSlice();
                is__.endReadSlice();
                base.read__(is__, true);
            }

            public override void write__(Ice.OutputStream outS__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::IllegalArgumentExceptionIce was not generated with stream support";
                throw ex;
            }

            public override void read__(Ice.InputStream inS__, bool rid__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::IllegalArgumentExceptionIce was not generated with stream support";
                throw ex;
            }

            public override bool usesClasses__()
            {
                return true;
            }

            #endregion
        }

        public class DirectoryNotFoundExceptionIce : rebecca.impl.ExceptionIce
        {
            #region Constructors

            public DirectoryNotFoundExceptionIce()
            {
            }

            public DirectoryNotFoundExceptionIce(_System.Exception ex__) : base(ex__)
            {
            }

            public DirectoryNotFoundExceptionIce(string what) : base(what)
            {
            }

            public DirectoryNotFoundExceptionIce(string what, _System.Exception ex__) : base(what, ex__)
            {
            }

            #endregion

            #region Object members

            public override int GetHashCode()
            {
                int h__ = 0;
                return h__;
            }

            public override bool Equals(object other__)
            {
                if(other__ == null)
                {
                    return false;
                }
                if(object.ReferenceEquals(this, other__))
                {
                    return true;
                }
                if(!(other__ is DirectoryNotFoundExceptionIce))
                {
                    return false;
                }
                return true;
            }

            #endregion

            #region Comparison members

            public static bool operator==(DirectoryNotFoundExceptionIce lhs__, DirectoryNotFoundExceptionIce rhs__)
            {
                return Equals(lhs__, rhs__);
            }

            public static bool operator!=(DirectoryNotFoundExceptionIce lhs__, DirectoryNotFoundExceptionIce rhs__)
            {
                return !Equals(lhs__, rhs__);
            }

            #endregion

            #region Marshaling support

            public override void write__(IceInternal.BasicStream os__)
            {
                os__.writeString("::rebecca::impl::DirectoryNotFoundExceptionIce");
                os__.startWriteSlice();
                os__.endWriteSlice();
                base.write__(os__);
            }

            public override void read__(IceInternal.BasicStream is__, bool rid__)
            {
                if(rid__)
                {
                    /* string myId = */ is__.readString();
                }
                is__.startReadSlice();
                is__.endReadSlice();
                base.read__(is__, true);
            }

            public override void write__(Ice.OutputStream outS__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::DirectoryNotFoundExceptionIce was not generated with stream support";
                throw ex;
            }

            public override void read__(Ice.InputStream inS__, bool rid__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::DirectoryNotFoundExceptionIce was not generated with stream support";
                throw ex;
            }

            public override bool usesClasses__()
            {
                return true;
            }

            #endregion
        }

        public class XMLErrorExceptionIce : rebecca.impl.ExceptionIce
        {
            #region Constructors

            public XMLErrorExceptionIce()
            {
            }

            public XMLErrorExceptionIce(_System.Exception ex__) : base(ex__)
            {
            }

            public XMLErrorExceptionIce(string what) : base(what)
            {
            }

            public XMLErrorExceptionIce(string what, _System.Exception ex__) : base(what, ex__)
            {
            }

            #endregion

            #region Object members

            public override int GetHashCode()
            {
                int h__ = 0;
                return h__;
            }

            public override bool Equals(object other__)
            {
                if(other__ == null)
                {
                    return false;
                }
                if(object.ReferenceEquals(this, other__))
                {
                    return true;
                }
                if(!(other__ is XMLErrorExceptionIce))
                {
                    return false;
                }
                return true;
            }

            #endregion

            #region Comparison members

            public static bool operator==(XMLErrorExceptionIce lhs__, XMLErrorExceptionIce rhs__)
            {
                return Equals(lhs__, rhs__);
            }

            public static bool operator!=(XMLErrorExceptionIce lhs__, XMLErrorExceptionIce rhs__)
            {
                return !Equals(lhs__, rhs__);
            }

            #endregion

            #region Marshaling support

            public override void write__(IceInternal.BasicStream os__)
            {
                os__.writeString("::rebecca::impl::XMLErrorExceptionIce");
                os__.startWriteSlice();
                os__.endWriteSlice();
                base.write__(os__);
            }

            public override void read__(IceInternal.BasicStream is__, bool rid__)
            {
                if(rid__)
                {
                    /* string myId = */ is__.readString();
                }
                is__.startReadSlice();
                is__.endReadSlice();
                base.read__(is__, true);
            }

            public override void write__(Ice.OutputStream outS__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::XMLErrorExceptionIce was not generated with stream support";
                throw ex;
            }

            public override void read__(Ice.InputStream inS__, bool rid__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "exception rebecca::impl::XMLErrorExceptionIce was not generated with stream support";
                throw ex;
            }

            public override bool usesClasses__()
            {
                return true;
            }

            #endregion
        }

        public interface NetworkGraphBuilderIce : Ice.Object, NetworkGraphBuilderIceOperations_, NetworkGraphBuilderIceOperationsNC_
        {
        }
    }
}

namespace rebecca
{
    namespace impl
    {
        public interface CallBacksIcePrx : Ice.ObjectPrx
        {
            void storeGossip(string gossip, string userId, string botId, string endUserId);
            void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Context context__);

            void categoryLoaded(string userId, string botId, string endUserId);
            void categoryLoaded(string userId, string botId, string endUserId, Ice.Context context__);

            void filePreLoad(string fileName, string userId, string botId, string endUserId);
            void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__);

            void filePostLoad(string fileName, string userId, string botId, string endUserId);
            void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__);

            void symbolicReduction(string symbol, string userId, string botId, string endUserId);
            void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Context context__);

            void infiniteSymbolicReduction(string userId, string botId, string endUserId);
            void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Context context__);

            void XMLParseError(string message, string userId, string botId, string endUserId);
            void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void XMLParseWarning(string message, string userId, string botId, string endUserId);
            void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void XMLParseFatalError(string message, string userId, string botId, string endUserId);
            void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void thatStarTagSizeExceeded(string userId, string botId, string endUserId);
            void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void topicStarTagSizeExceeded(string userId, string botId, string endUserId);
            void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void starTagSizeExceeded(string userId, string botId, string endUserId);
            void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void inputTagNumericConversionError(string message, string userId, string botId, string endUserId);
            void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void inputTagSizeExceeded(string userId, string botId, string endUserId);
            void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void starTagNumericConversionError(string message, string userId, string botId, string endUserId);
            void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void thatTagSizeExceeded(string userId, string botId, string endUserId);
            void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void thatTagNumericConversionError(string message, string userId, string botId, string endUserId);
            void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId);
            void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId);
            void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void learnTagFileNotFound(string message, string userId, string botId, string endUserId);
            void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Context context__);
        }

        public interface NetworkGraphBuilderIcePrx : Ice.ObjectPrx
        {
            void addFile(string file, string userId, string botId, string endUserId);
            void addFile(string file, string userId, string botId, string endUserId, Ice.Context context__);

            void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId);
            void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Context context__);

            void removeFile(string file, string userId, string botId, string endUserId);
            void removeFile(string file, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectory(string directory, string userId, string botId, string endUserId);
            void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId);
            void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId);
            void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId);
            void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__);

            void removeDirectory(string directory, string userId, string botId, string endUserId);
            void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__);

            void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId);
            void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__);

            void addString(string stringContainingAIML, string userId, string botId, string endUserId);
            void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__);

            void removeString(string stringContainingAIML, string userId, string botId, string endUserId);
            void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__);

            void setAddStringAIMLHeader(string aimlHeader);
            void setAddStringAIMLHeader(string aimlHeader, Ice.Context context__);

            void setAddStringAIMLFooter(string aimlFooter);
            void setAddStringAIMLFooter(string aimlFooter, Ice.Context context__);

            void setAIMLSchema(string schema);
            void setAIMLSchema(string schema, Ice.Context context__);

            void setCommonTypesSchema(string schema);
            void setCommonTypesSchema(string schema, Ice.Context context__);

            void setAIMLValidation(bool trueOrFalse);
            void setAIMLValidation(bool trueOrFalse, Ice.Context context__);

            string getResponse(string input, string userId, string botId, string endUserId);
            string getResponse(string input, string userId, string botId, string endUserId, Ice.Context context__);

            void setThat(string that, string userId, string botId, string endUserId);
            void setThat(string that, string userId, string botId, string endUserId, Ice.Context context__);

            void setTopic(string topic, string userId, string botId, string endUserId);
            void setTopic(string topic, string userId, string botId, string endUserId, Ice.Context context__);

            string getThat(string userId, string botId, string endUserId);
            string getThat(string userId, string botId, string endUserId, Ice.Context context__);

            string getTopic(string userId, string botId, string endUserId);
            string getTopic(string userId, string botId, string endUserId, Ice.Context context__);

            void createGraph(string userId, string botId, string endUserId);
            void createGraph(string userId, string botId, string endUserId, Ice.Context context__);

            void removeGraph(string userId, string botId, string endUserId);
            void removeGraph(string userId, string botId, string endUserId, Ice.Context context__);

            bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId);
            bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Context context__);

            void setPredicate(string name, string value, string userId, string botId, string endUserId);
            void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__);

            string getPredicate(string name, string userId, string botId, string endUserId);
            string getPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            string getBotPredicate(string name, string userId, string botId, string endUserId);
            string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            void setBotPredicate(string name, string value, string userId, string botId, string endUserId);
            void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__);

            string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId);
            string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Context context__);

            string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId);
            string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Context context__);

            void setBotConfigurationSchema(string schema);
            void setBotConfigurationSchema(string schema, Ice.Context context__);

            void setBotConfigurationValidation(bool trueOrFalse);
            void setBotConfigurationValidation(bool trueOrFalse, Ice.Context context__);

            void parseSubstitutionFile(string fileName);
            void parseSubstitutionFile(string fileName, Ice.Context context__);

            void parseSentenceSplitterFile(string fileName);
            void parseSentenceSplitterFile(string fileName, Ice.Context context__);

            void parsePropertiesFile(string fileName, string userId, string botId, string endUserId);
            void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Context context__);

            void setSentenceSplitter(string splitter);
            void setSentenceSplitter(string splitter, Ice.Context context__);

            void setInputSubstitution(string find, string replace);
            void setInputSubstitution(string find, string replace, Ice.Context context__);

            void setGenderSubstitution(string find, string replace);
            void setGenderSubstitution(string find, string replace, Ice.Context context__);

            void setPersonSubstitution(string find, string replace);
            void setPersonSubstitution(string find, string replace, Ice.Context context__);

            void setPerson2Substitution(string find, string replace);
            void setPerson2Substitution(string find, string replace, Ice.Context context__);

            string getVersion();
            string getVersion(Ice.Context context__);

            int getSize(string userId, string botId, string endUserId);
            int getSize(string userId, string botId, string endUserId, Ice.Context context__);

            void setCallBacks(string name, string category);
            void setCallBacks(string name, string category, Ice.Context context__);

            void storeGossip(string gossip);
            void storeGossip(string gossip, Ice.Context context__);

            string getId();
            string getId(Ice.Context context__);

            void addCustomTagLibrary(string library);
            void addCustomTagLibrary(string library, Ice.Context context__);

            void removeCustomTagLibrary(string library);
            void removeCustomTagLibrary(string library, Ice.Context context__);

            string callSystemCommand(string command);
            string callSystemCommand(string command, Ice.Context context__);

            void synchronizeDatabase();
            void synchronizeDatabase(Ice.Context context__);

            string[] getAIMLFileList(string userId, string botId, string endUserId);
            string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Context context__);

            int getAIMLFileListSize(string userId, string botId, string endUserId);
            int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Context context__);

            string[] getAIMLStringList(string userId, string botId, string endUserId);
            string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Context context__);

            int getAIMLStringListSize(string userId, string botId, string endUserId);
            int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Context context__);

            string[] getUserIds();
            string[] getUserIds(Ice.Context context__);

            int getUserIdsSize();
            int getUserIdsSize(Ice.Context context__);

            string[] getBotIds(string userId);
            string[] getBotIds(string userId, Ice.Context context__);

            int getBotIdsSize(string userId);
            int getBotIdsSize(string userId, Ice.Context context__);

            string[] getEndUserIds(string userId, string botId);
            string[] getEndUserIds(string userId, string botId, Ice.Context context__);

            int getEndUserIdsSize(string userId, string botId);
            int getEndUserIdsSize(string userId, string botId, Ice.Context context__);

            void printEntireDatabase();
            void printEntireDatabase(Ice.Context context__);

            string[] getBotPredicates(string userId, string botId, string endUserId);
            string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Context context__);

            string[] getPredicates(string userId, string botId, string endUserId);
            string[] getPredicates(string userId, string botId, string endUserId, Ice.Context context__);

            int getBotPredicatesSize(string userId, string botId, string endUserId);
            int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__);

            int getPredicatesSize(string userId, string botId, string endUserId);
            int getPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__);

            void removePredicate(string name, string userId, string botId, string endUserId);
            void removePredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            void removeBotPredicate(string name, string userId, string botId, string endUserId);
            void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            void removeEndUser(string userId, string botId, string endUserId);
            void removeEndUser(string userId, string botId, string endUserId, Ice.Context context__);

            void removeBot(string userId, string botId);
            void removeBot(string userId, string botId, Ice.Context context__);

            void removeUser(string userId);
            void removeUser(string userId, Ice.Context context__);
        }
    }
}

namespace rebecca
{
    namespace impl
    {
        public interface CallBacksIceOperations_
        {
            void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Current current__);

            void categoryLoaded(string userId, string botId, string endUserId, Ice.Current current__);

            void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Current current__);

            void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Current current__);

            void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Current current__);

            void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Current current__);

            void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Current current__);
        }

        public interface CallBacksIceOperationsNC_
        {
            void storeGossip(string gossip, string userId, string botId, string endUserId);

            void categoryLoaded(string userId, string botId, string endUserId);

            void filePreLoad(string fileName, string userId, string botId, string endUserId);

            void filePostLoad(string fileName, string userId, string botId, string endUserId);

            void symbolicReduction(string symbol, string userId, string botId, string endUserId);

            void infiniteSymbolicReduction(string userId, string botId, string endUserId);

            void XMLParseError(string message, string userId, string botId, string endUserId);

            void XMLParseWarning(string message, string userId, string botId, string endUserId);

            void XMLParseFatalError(string message, string userId, string botId, string endUserId);

            void thatStarTagSizeExceeded(string userId, string botId, string endUserId);

            void topicStarTagSizeExceeded(string userId, string botId, string endUserId);

            void starTagSizeExceeded(string userId, string botId, string endUserId);

            void inputTagNumericConversionError(string message, string userId, string botId, string endUserId);

            void inputTagSizeExceeded(string userId, string botId, string endUserId);

            void starTagNumericConversionError(string message, string userId, string botId, string endUserId);

            void thatTagSizeExceeded(string userId, string botId, string endUserId);

            void thatTagNumericConversionError(string message, string userId, string botId, string endUserId);

            void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId);

            void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId);

            void learnTagFileNotFound(string message, string userId, string botId, string endUserId);
        }

        public interface NetworkGraphBuilderIceOperations_
        {
            void addFile(string file, string userId, string botId, string endUserId, Ice.Current current__);

            void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Current current__);

            void removeFile(string file, string userId, string botId, string endUserId, Ice.Current current__);

            void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Current current__);

            void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Current current__);

            void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Current current__);

            void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Current current__);

            void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Current current__);

            void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Current current__);

            void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Current current__);

            void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Current current__);

            void setAddStringAIMLHeader(string aimlHeader, Ice.Current current__);

            void setAddStringAIMLFooter(string aimlFooter, Ice.Current current__);

            void setAIMLSchema(string schema, Ice.Current current__);

            void setCommonTypesSchema(string schema, Ice.Current current__);

            void setAIMLValidation(bool trueOrFalse, Ice.Current current__);

            string getResponse(string input, string userId, string botId, string endUserId, Ice.Current current__);

            void setThat(string that, string userId, string botId, string endUserId, Ice.Current current__);

            void setTopic(string topic, string userId, string botId, string endUserId, Ice.Current current__);

            string getThat(string userId, string botId, string endUserId, Ice.Current current__);

            string getTopic(string userId, string botId, string endUserId, Ice.Current current__);

            void createGraph(string userId, string botId, string endUserId, Ice.Current current__);

            void removeGraph(string userId, string botId, string endUserId, Ice.Current current__);

            bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Current current__);

            void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Current current__);

            string getPredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Current current__);

            string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Current current__);

            string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Current current__);

            void setBotConfigurationSchema(string schema, Ice.Current current__);

            void setBotConfigurationValidation(bool trueOrFalse, Ice.Current current__);

            void parseSubstitutionFile(string fileName, Ice.Current current__);

            void parseSentenceSplitterFile(string fileName, Ice.Current current__);

            void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Current current__);

            void setSentenceSplitter(string splitter, Ice.Current current__);

            void setInputSubstitution(string find, string replace, Ice.Current current__);

            void setGenderSubstitution(string find, string replace, Ice.Current current__);

            void setPersonSubstitution(string find, string replace, Ice.Current current__);

            void setPerson2Substitution(string find, string replace, Ice.Current current__);

            string getVersion(Ice.Current current__);

            int getSize(string userId, string botId, string endUserId, Ice.Current current__);

            void setCallBacks(string name, string category, Ice.Current current__);

            void storeGossip(string gossip, Ice.Current current__);

            string getId(Ice.Current current__);

            void addCustomTagLibrary(string library, Ice.Current current__);

            void removeCustomTagLibrary(string library, Ice.Current current__);

            string callSystemCommand(string command, Ice.Current current__);

            void synchronizeDatabase(Ice.Current current__);

            string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Current current__);

            int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Current current__);

            string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Current current__);

            int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Current current__);

            string[] getUserIds(Ice.Current current__);

            int getUserIdsSize(Ice.Current current__);

            string[] getBotIds(string userId, Ice.Current current__);

            int getBotIdsSize(string userId, Ice.Current current__);

            string[] getEndUserIds(string userId, string botId, Ice.Current current__);

            int getEndUserIdsSize(string userId, string botId, Ice.Current current__);

            void printEntireDatabase(Ice.Current current__);

            string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Current current__);

            string[] getPredicates(string userId, string botId, string endUserId, Ice.Current current__);

            int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Current current__);

            int getPredicatesSize(string userId, string botId, string endUserId, Ice.Current current__);

            void removePredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            void removeEndUser(string userId, string botId, string endUserId, Ice.Current current__);

            void removeBot(string userId, string botId, Ice.Current current__);

            void removeUser(string userId, Ice.Current current__);
        }

        public interface NetworkGraphBuilderIceOperationsNC_
        {
            void addFile(string file, string userId, string botId, string endUserId);

            void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId);

            void removeFile(string file, string userId, string botId, string endUserId);

            void addDirectory(string directory, string userId, string botId, string endUserId);

            void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId);

            void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId);

            void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId);

            void removeDirectory(string directory, string userId, string botId, string endUserId);

            void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId);

            void addString(string stringContainingAIML, string userId, string botId, string endUserId);

            void removeString(string stringContainingAIML, string userId, string botId, string endUserId);

            void setAddStringAIMLHeader(string aimlHeader);

            void setAddStringAIMLFooter(string aimlFooter);

            void setAIMLSchema(string schema);

            void setCommonTypesSchema(string schema);

            void setAIMLValidation(bool trueOrFalse);

            string getResponse(string input, string userId, string botId, string endUserId);

            void setThat(string that, string userId, string botId, string endUserId);

            void setTopic(string topic, string userId, string botId, string endUserId);

            string getThat(string userId, string botId, string endUserId);

            string getTopic(string userId, string botId, string endUserId);

            void createGraph(string userId, string botId, string endUserId);

            void removeGraph(string userId, string botId, string endUserId);

            bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId);

            void setPredicate(string name, string value, string userId, string botId, string endUserId);

            string getPredicate(string name, string userId, string botId, string endUserId);

            string getBotPredicate(string name, string userId, string botId, string endUserId);

            void setBotPredicate(string name, string value, string userId, string botId, string endUserId);

            string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId);

            string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId);

            void setBotConfigurationSchema(string schema);

            void setBotConfigurationValidation(bool trueOrFalse);

            void parseSubstitutionFile(string fileName);

            void parseSentenceSplitterFile(string fileName);

            void parsePropertiesFile(string fileName, string userId, string botId, string endUserId);

            void setSentenceSplitter(string splitter);

            void setInputSubstitution(string find, string replace);

            void setGenderSubstitution(string find, string replace);

            void setPersonSubstitution(string find, string replace);

            void setPerson2Substitution(string find, string replace);

            string getVersion();

            int getSize(string userId, string botId, string endUserId);

            void setCallBacks(string name, string category);

            void storeGossip(string gossip);

            string getId();

            void addCustomTagLibrary(string library);

            void removeCustomTagLibrary(string library);

            string callSystemCommand(string command);

            void synchronizeDatabase();

            string[] getAIMLFileList(string userId, string botId, string endUserId);

            int getAIMLFileListSize(string userId, string botId, string endUserId);

            string[] getAIMLStringList(string userId, string botId, string endUserId);

            int getAIMLStringListSize(string userId, string botId, string endUserId);

            string[] getUserIds();

            int getUserIdsSize();

            string[] getBotIds(string userId);

            int getBotIdsSize(string userId);

            string[] getEndUserIds(string userId, string botId);

            int getEndUserIdsSize(string userId, string botId);

            void printEntireDatabase();

            string[] getBotPredicates(string userId, string botId, string endUserId);

            string[] getPredicates(string userId, string botId, string endUserId);

            int getBotPredicatesSize(string userId, string botId, string endUserId);

            int getPredicatesSize(string userId, string botId, string endUserId);

            void removePredicate(string name, string userId, string botId, string endUserId);

            void removeBotPredicate(string name, string userId, string botId, string endUserId);

            void removeEndUser(string userId, string botId, string endUserId);

            void removeBot(string userId, string botId);

            void removeUser(string userId);
        }
    }
}

namespace rebecca
{
    namespace impl
    {
        public sealed class StringSeqHelper
        {
            public static void write(IceInternal.BasicStream os__, string[] v__)
            {
                os__.writeStringSeq(v__);
            }

            public static string[] read(IceInternal.BasicStream is__)
            {
                string[] v__;
                v__ = is__.readStringSeq();
                return v__;
            }
        }

        public sealed class CallBacksIcePrxHelper : Ice.ObjectPrxHelperBase, CallBacksIcePrx
        {
            #region Synchronous operations

            public void XMLParseError(string message, string userId, string botId, string endUserId)
            {
                XMLParseError(message, userId, botId, endUserId, null, false);
            }

            public void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                XMLParseError(message, userId, botId, endUserId, context__, true);
            }

            private void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.XMLParseError(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void XMLParseFatalError(string message, string userId, string botId, string endUserId)
            {
                XMLParseFatalError(message, userId, botId, endUserId, null, false);
            }

            public void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                XMLParseFatalError(message, userId, botId, endUserId, context__, true);
            }

            private void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.XMLParseFatalError(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void XMLParseWarning(string message, string userId, string botId, string endUserId)
            {
                XMLParseWarning(message, userId, botId, endUserId, null, false);
            }

            public void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                XMLParseWarning(message, userId, botId, endUserId, context__, true);
            }

            private void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.XMLParseWarning(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void categoryLoaded(string userId, string botId, string endUserId)
            {
                categoryLoaded(userId, botId, endUserId, null, false);
            }

            public void categoryLoaded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                categoryLoaded(userId, botId, endUserId, context__, true);
            }

            private void categoryLoaded(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.categoryLoaded(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void filePostLoad(string fileName, string userId, string botId, string endUserId)
            {
                filePostLoad(fileName, userId, botId, endUserId, null, false);
            }

            public void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                filePostLoad(fileName, userId, botId, endUserId, context__, true);
            }

            private void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.filePostLoad(fileName, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void filePreLoad(string fileName, string userId, string botId, string endUserId)
            {
                filePreLoad(fileName, userId, botId, endUserId, null, false);
            }

            public void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                filePreLoad(fileName, userId, botId, endUserId, context__, true);
            }

            private void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.filePreLoad(fileName, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void infiniteSymbolicReduction(string userId, string botId, string endUserId)
            {
                infiniteSymbolicReduction(userId, botId, endUserId, null, false);
            }

            public void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Context context__)
            {
                infiniteSymbolicReduction(userId, botId, endUserId, context__, true);
            }

            private void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.infiniteSymbolicReduction(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void inputTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                inputTagNumericConversionError(message, userId, botId, endUserId, null, false);
            }

            public void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                inputTagNumericConversionError(message, userId, botId, endUserId, context__, true);
            }

            private void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.inputTagNumericConversionError(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void inputTagSizeExceeded(string userId, string botId, string endUserId)
            {
                inputTagSizeExceeded(userId, botId, endUserId, null, false);
            }

            public void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                inputTagSizeExceeded(userId, botId, endUserId, context__, true);
            }

            private void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.inputTagSizeExceeded(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void learnTagFileNotFound(string message, string userId, string botId, string endUserId)
            {
                learnTagFileNotFound(message, userId, botId, endUserId, null, false);
            }

            public void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                learnTagFileNotFound(message, userId, botId, endUserId, context__, true);
            }

            private void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.learnTagFileNotFound(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void starTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                starTagNumericConversionError(message, userId, botId, endUserId, null, false);
            }

            public void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                starTagNumericConversionError(message, userId, botId, endUserId, context__, true);
            }

            private void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.starTagNumericConversionError(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void starTagSizeExceeded(string userId, string botId, string endUserId)
            {
                starTagSizeExceeded(userId, botId, endUserId, null, false);
            }

            public void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                starTagSizeExceeded(userId, botId, endUserId, context__, true);
            }

            private void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.starTagSizeExceeded(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void storeGossip(string gossip, string userId, string botId, string endUserId)
            {
                storeGossip(gossip, userId, botId, endUserId, null, false);
            }

            public void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Context context__)
            {
                storeGossip(gossip, userId, botId, endUserId, context__, true);
            }

            private void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.storeGossip(gossip, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void symbolicReduction(string symbol, string userId, string botId, string endUserId)
            {
                symbolicReduction(symbol, userId, botId, endUserId, null, false);
            }

            public void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Context context__)
            {
                symbolicReduction(symbol, userId, botId, endUserId, context__, true);
            }

            private void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.symbolicReduction(symbol, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                thatStarTagNumericConversionError(message, userId, botId, endUserId, null, false);
            }

            public void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                thatStarTagNumericConversionError(message, userId, botId, endUserId, context__, true);
            }

            private void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.thatStarTagNumericConversionError(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void thatStarTagSizeExceeded(string userId, string botId, string endUserId)
            {
                thatStarTagSizeExceeded(userId, botId, endUserId, null, false);
            }

            public void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                thatStarTagSizeExceeded(userId, botId, endUserId, context__, true);
            }

            private void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.thatStarTagSizeExceeded(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void thatTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                thatTagNumericConversionError(message, userId, botId, endUserId, null, false);
            }

            public void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                thatTagNumericConversionError(message, userId, botId, endUserId, context__, true);
            }

            private void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.thatTagNumericConversionError(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void thatTagSizeExceeded(string userId, string botId, string endUserId)
            {
                thatTagSizeExceeded(userId, botId, endUserId, null, false);
            }

            public void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                thatTagSizeExceeded(userId, botId, endUserId, context__, true);
            }

            private void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.thatTagSizeExceeded(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                topicStarTagNumericConversionError(message, userId, botId, endUserId, null, false);
            }

            public void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                topicStarTagNumericConversionError(message, userId, botId, endUserId, context__, true);
            }

            private void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.topicStarTagNumericConversionError(message, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void topicStarTagSizeExceeded(string userId, string botId, string endUserId)
            {
                topicStarTagSizeExceeded(userId, botId, endUserId, null, false);
            }

            public void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                topicStarTagSizeExceeded(userId, botId, endUserId, context__, true);
            }

            private void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        delBase__ = getDelegate__();
                        CallBacksIceDel_ del__ = (CallBacksIceDel_)delBase__;
                        del__.topicStarTagSizeExceeded(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            #endregion

            #region Checked and unchecked cast operations

            public static CallBacksIcePrx checkedCast(Ice.ObjectPrx b)
            {
                if(b == null)
                {
                    return null;
                }
                if(b is CallBacksIcePrx)
                {
                    return (CallBacksIcePrx)b;
                }
                if(b.ice_isA("::rebecca::impl::CallBacksIce"))
                {
                    CallBacksIcePrxHelper h = new CallBacksIcePrxHelper();
                    h.copyFrom__(b);
                    return h;
                }
                return null;
            }

            public static CallBacksIcePrx checkedCast(Ice.ObjectPrx b, Ice.Context ctx)
            {
                if(b == null)
                {
                    return null;
                }
                if(b is CallBacksIcePrx)
                {
                    return (CallBacksIcePrx)b;
                }
                if(b.ice_isA("::rebecca::impl::CallBacksIce", ctx))
                {
                    CallBacksIcePrxHelper h = new CallBacksIcePrxHelper();
                    h.copyFrom__(b);
                    return h;
                }
                return null;
            }

            public static CallBacksIcePrx checkedCast(Ice.ObjectPrx b, string f)
            {
                if(b == null)
                {
                    return null;
                }
                Ice.ObjectPrx bb = b.ice_facet(f);
                try
                {
                    if(bb.ice_isA("::rebecca::impl::CallBacksIce"))
                    {
                        CallBacksIcePrxHelper h = new CallBacksIcePrxHelper();
                        h.copyFrom__(bb);
                        return h;
                    }
                }
                catch(Ice.FacetNotExistException)
                {
                }
                return null;
            }

            public static CallBacksIcePrx checkedCast(Ice.ObjectPrx b, string f, Ice.Context ctx)
            {
                if(b == null)
                {
                    return null;
                }
                Ice.ObjectPrx bb = b.ice_facet(f);
                try
                {
                    if(bb.ice_isA("::rebecca::impl::CallBacksIce", ctx))
                    {
                        CallBacksIcePrxHelper h = new CallBacksIcePrxHelper();
                        h.copyFrom__(bb);
                        return h;
                    }
                }
                catch(Ice.FacetNotExistException)
                {
                }
                return null;
            }

            public static CallBacksIcePrx uncheckedCast(Ice.ObjectPrx b)
            {
                if(b == null)
                {
                    return null;
                }
                CallBacksIcePrxHelper h = new CallBacksIcePrxHelper();
                h.copyFrom__(b);
                return h;
            }

            public static CallBacksIcePrx uncheckedCast(Ice.ObjectPrx b, string f)
            {
                if(b == null)
                {
                    return null;
                }
                Ice.ObjectPrx bb = b.ice_facet(f);
                CallBacksIcePrxHelper h = new CallBacksIcePrxHelper();
                h.copyFrom__(bb);
                return h;
            }

            #endregion

            #region Marshaling support

            protected override Ice.ObjectDelM_ createDelegateM__()
            {
                return new CallBacksIceDelM_();
            }

            protected override Ice.ObjectDelD_ createDelegateD__()
            {
                return new CallBacksIceDelD_();
            }

            public static void write__(IceInternal.BasicStream os__, CallBacksIcePrx v__)
            {
                os__.writeProxy(v__);
            }

            public static CallBacksIcePrx read__(IceInternal.BasicStream is__)
            {
                Ice.ObjectPrx proxy = is__.readProxy();
                if(proxy != null)
                {
                    CallBacksIcePrxHelper result = new CallBacksIcePrxHelper();
                    result.copyFrom__(proxy);
                    return result;
                }
                return null;
            }

            #endregion
        }

        public sealed class NetworkGraphBuilderIcePrxHelper : Ice.ObjectPrxHelperBase, NetworkGraphBuilderIcePrx
        {
            #region Synchronous operations

            public void addCustomTagLibrary(string library)
            {
                addCustomTagLibrary(library, null, false);
            }

            public void addCustomTagLibrary(string library, Ice.Context context__)
            {
                addCustomTagLibrary(library, context__, true);
            }

            private void addCustomTagLibrary(string library, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addCustomTagLibrary");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addCustomTagLibrary(library, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void addDirectory(string directory, string userId, string botId, string endUserId)
            {
                addDirectory(directory, userId, botId, endUserId, null, false);
            }

            public void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                addDirectory(directory, userId, botId, endUserId, context__, true);
            }

            private void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addDirectory");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addDirectory(directory, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId)
            {
                addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, null, false);
            }

            public void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, context__, true);
            }

            private void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addDirectoryUnlessAlreadyAdded");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId)
            {
                addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, null, false);
            }

            public void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, context__, true);
            }

            private void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addDirectoryWithFilesEndingInRegularExpression");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId)
            {
                addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, null, false);
            }

            public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, context__, true);
            }

            private void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void addFile(string file, string userId, string botId, string endUserId)
            {
                addFile(file, userId, botId, endUserId, null, false);
            }

            public void addFile(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                addFile(file, userId, botId, endUserId, context__, true);
            }

            private void addFile(string file, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addFile");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addFile(file, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId)
            {
                addFileUnlessAlreadyAdded(file, userId, botId, endUserId, null, false);
            }

            public void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                addFileUnlessAlreadyAdded(file, userId, botId, endUserId, context__, true);
            }

            private void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addFileUnlessAlreadyAdded");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addFileUnlessAlreadyAdded(file, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void addString(string stringContainingAIML, string userId, string botId, string endUserId)
            {
                addString(stringContainingAIML, userId, botId, endUserId, null, false);
            }

            public void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__)
            {
                addString(stringContainingAIML, userId, botId, endUserId, context__, true);
            }

            private void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("addString");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.addString(stringContainingAIML, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string callSystemCommand(string command)
            {
                return callSystemCommand(command, null, false);
            }

            public string callSystemCommand(string command, Ice.Context context__)
            {
                return callSystemCommand(command, context__, true);
            }

            private string callSystemCommand(string command, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("callSystemCommand");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.callSystemCommand(command, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void createGraph(string userId, string botId, string endUserId)
            {
                createGraph(userId, botId, endUserId, null, false);
            }

            public void createGraph(string userId, string botId, string endUserId, Ice.Context context__)
            {
                createGraph(userId, botId, endUserId, context__, true);
            }

            private void createGraph(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("createGraph");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.createGraph(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string[] getAIMLFileList(string userId, string botId, string endUserId)
            {
                return getAIMLFileList(userId, botId, endUserId, null, false);
            }

            public string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getAIMLFileList(userId, botId, endUserId, context__, true);
            }

            private string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getAIMLFileList");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getAIMLFileList(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getAIMLFileListSize(string userId, string botId, string endUserId)
            {
                return getAIMLFileListSize(userId, botId, endUserId, null, false);
            }

            public int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getAIMLFileListSize(userId, botId, endUserId, context__, true);
            }

            private int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getAIMLFileListSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getAIMLFileListSize(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string[] getAIMLStringList(string userId, string botId, string endUserId)
            {
                return getAIMLStringList(userId, botId, endUserId, null, false);
            }

            public string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getAIMLStringList(userId, botId, endUserId, context__, true);
            }

            private string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getAIMLStringList");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getAIMLStringList(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getAIMLStringListSize(string userId, string botId, string endUserId)
            {
                return getAIMLStringListSize(userId, botId, endUserId, null, false);
            }

            public int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getAIMLStringListSize(userId, botId, endUserId, context__, true);
            }

            private int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getAIMLStringListSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getAIMLStringListSize(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string[] getBotIds(string userId)
            {
                return getBotIds(userId, null, false);
            }

            public string[] getBotIds(string userId, Ice.Context context__)
            {
                return getBotIds(userId, context__, true);
            }

            private string[] getBotIds(string userId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getBotIds");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getBotIds(userId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getBotIdsSize(string userId)
            {
                return getBotIdsSize(userId, null, false);
            }

            public int getBotIdsSize(string userId, Ice.Context context__)
            {
                return getBotIdsSize(userId, context__, true);
            }

            private int getBotIdsSize(string userId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getBotIdsSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getBotIdsSize(userId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getBotPredicate(string name, string userId, string botId, string endUserId)
            {
                return getBotPredicate(name, userId, botId, endUserId, null, false);
            }

            public string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getBotPredicate(name, userId, botId, endUserId, context__, true);
            }

            private string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getBotPredicate");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getBotPredicate(name, userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string[] getBotPredicates(string userId, string botId, string endUserId)
            {
                return getBotPredicates(userId, botId, endUserId, null, false);
            }

            public string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getBotPredicates(userId, botId, endUserId, context__, true);
            }

            private string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getBotPredicates");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getBotPredicates(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getBotPredicatesSize(string userId, string botId, string endUserId)
            {
                return getBotPredicatesSize(userId, botId, endUserId, null, false);
            }

            public int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getBotPredicatesSize(userId, botId, endUserId, context__, true);
            }

            private int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getBotPredicatesSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getBotPredicatesSize(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string[] getEndUserIds(string userId, string botId)
            {
                return getEndUserIds(userId, botId, null, false);
            }

            public string[] getEndUserIds(string userId, string botId, Ice.Context context__)
            {
                return getEndUserIds(userId, botId, context__, true);
            }

            private string[] getEndUserIds(string userId, string botId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getEndUserIds");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getEndUserIds(userId, botId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getEndUserIdsSize(string userId, string botId)
            {
                return getEndUserIdsSize(userId, botId, null, false);
            }

            public int getEndUserIdsSize(string userId, string botId, Ice.Context context__)
            {
                return getEndUserIdsSize(userId, botId, context__, true);
            }

            private int getEndUserIdsSize(string userId, string botId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getEndUserIdsSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getEndUserIdsSize(userId, botId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getId()
            {
                return getId(null, false);
            }

            public string getId(Ice.Context context__)
            {
                return getId(context__, true);
            }

            private string getId(Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getId");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getId(context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getPredicate(string name, string userId, string botId, string endUserId)
            {
                return getPredicate(name, userId, botId, endUserId, null, false);
            }

            public string getPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getPredicate(name, userId, botId, endUserId, context__, true);
            }

            private string getPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getPredicate");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getPredicate(name, userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string[] getPredicates(string userId, string botId, string endUserId)
            {
                return getPredicates(userId, botId, endUserId, null, false);
            }

            public string[] getPredicates(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getPredicates(userId, botId, endUserId, context__, true);
            }

            private string[] getPredicates(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getPredicates");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getPredicates(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getPredicatesSize(string userId, string botId, string endUserId)
            {
                return getPredicatesSize(userId, botId, endUserId, null, false);
            }

            public int getPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getPredicatesSize(userId, botId, endUserId, context__, true);
            }

            private int getPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getPredicatesSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getPredicatesSize(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId)
            {
                return getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, null, false);
            }

            public string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, context__, true);
            }

            private string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getPreviousBotResponse");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId)
            {
                return getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, null, false);
            }

            public string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, context__, true);
            }

            private string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getPreviousUserInput");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getResponse(string input, string userId, string botId, string endUserId)
            {
                return getResponse(input, userId, botId, endUserId, null, false);
            }

            public string getResponse(string input, string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getResponse(input, userId, botId, endUserId, context__, true);
            }

            private string getResponse(string input, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getResponse");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getResponse(input, userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getSize(string userId, string botId, string endUserId)
            {
                return getSize(userId, botId, endUserId, null, false);
            }

            public int getSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getSize(userId, botId, endUserId, context__, true);
            }

            private int getSize(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getSize(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getThat(string userId, string botId, string endUserId)
            {
                return getThat(userId, botId, endUserId, null, false);
            }

            public string getThat(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getThat(userId, botId, endUserId, context__, true);
            }

            private string getThat(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getThat");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getThat(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getTopic(string userId, string botId, string endUserId)
            {
                return getTopic(userId, botId, endUserId, null, false);
            }

            public string getTopic(string userId, string botId, string endUserId, Ice.Context context__)
            {
                return getTopic(userId, botId, endUserId, context__, true);
            }

            private string getTopic(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getTopic");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getTopic(userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string[] getUserIds()
            {
                return getUserIds(null, false);
            }

            public string[] getUserIds(Ice.Context context__)
            {
                return getUserIds(context__, true);
            }

            private string[] getUserIds(Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getUserIds");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getUserIds(context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public int getUserIdsSize()
            {
                return getUserIdsSize(null, false);
            }

            public int getUserIdsSize(Ice.Context context__)
            {
                return getUserIdsSize(context__, true);
            }

            private int getUserIdsSize(Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getUserIdsSize");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getUserIdsSize(context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public string getVersion()
            {
                return getVersion(null, false);
            }

            public string getVersion(Ice.Context context__)
            {
                return getVersion(context__, true);
            }

            private string getVersion(Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("getVersion");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.getVersion(context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void parsePropertiesFile(string fileName, string userId, string botId, string endUserId)
            {
                parsePropertiesFile(fileName, userId, botId, endUserId, null, false);
            }

            public void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                parsePropertiesFile(fileName, userId, botId, endUserId, context__, true);
            }

            private void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("parsePropertiesFile");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.parsePropertiesFile(fileName, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void parseSentenceSplitterFile(string fileName)
            {
                parseSentenceSplitterFile(fileName, null, false);
            }

            public void parseSentenceSplitterFile(string fileName, Ice.Context context__)
            {
                parseSentenceSplitterFile(fileName, context__, true);
            }

            private void parseSentenceSplitterFile(string fileName, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("parseSentenceSplitterFile");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.parseSentenceSplitterFile(fileName, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void parseSubstitutionFile(string fileName)
            {
                parseSubstitutionFile(fileName, null, false);
            }

            public void parseSubstitutionFile(string fileName, Ice.Context context__)
            {
                parseSubstitutionFile(fileName, context__, true);
            }

            private void parseSubstitutionFile(string fileName, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("parseSubstitutionFile");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.parseSubstitutionFile(fileName, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId)
            {
                return predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, null, false);
            }

            public bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Context context__)
            {
                return predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, context__, true);
            }

            private bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("predicateMatch");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        return del__.predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, context__);
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void printEntireDatabase()
            {
                printEntireDatabase(null, false);
            }

            public void printEntireDatabase(Ice.Context context__)
            {
                printEntireDatabase(context__, true);
            }

            private void printEntireDatabase(Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("printEntireDatabase");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.printEntireDatabase(context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeBot(string userId, string botId)
            {
                removeBot(userId, botId, null, false);
            }

            public void removeBot(string userId, string botId, Ice.Context context__)
            {
                removeBot(userId, botId, context__, true);
            }

            private void removeBot(string userId, string botId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeBot");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeBot(userId, botId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeBotPredicate(string name, string userId, string botId, string endUserId)
            {
                removeBotPredicate(name, userId, botId, endUserId, null, false);
            }

            public void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                removeBotPredicate(name, userId, botId, endUserId, context__, true);
            }

            private void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeBotPredicate");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeBotPredicate(name, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeCustomTagLibrary(string library)
            {
                removeCustomTagLibrary(library, null, false);
            }

            public void removeCustomTagLibrary(string library, Ice.Context context__)
            {
                removeCustomTagLibrary(library, context__, true);
            }

            private void removeCustomTagLibrary(string library, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeCustomTagLibrary");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeCustomTagLibrary(library, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeDirectory(string directory, string userId, string botId, string endUserId)
            {
                removeDirectory(directory, userId, botId, endUserId, null, false);
            }

            public void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                removeDirectory(directory, userId, botId, endUserId, context__, true);
            }

            private void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeDirectory");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeDirectory(directory, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId)
            {
                removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, null, false);
            }

            public void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, context__, true);
            }

            private void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeDirectoryWithFilesEndingInRegularExpression");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeEndUser(string userId, string botId, string endUserId)
            {
                removeEndUser(userId, botId, endUserId, null, false);
            }

            public void removeEndUser(string userId, string botId, string endUserId, Ice.Context context__)
            {
                removeEndUser(userId, botId, endUserId, context__, true);
            }

            private void removeEndUser(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeEndUser");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeEndUser(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeFile(string file, string userId, string botId, string endUserId)
            {
                removeFile(file, userId, botId, endUserId, null, false);
            }

            public void removeFile(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                removeFile(file, userId, botId, endUserId, context__, true);
            }

            private void removeFile(string file, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeFile");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeFile(file, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeGraph(string userId, string botId, string endUserId)
            {
                removeGraph(userId, botId, endUserId, null, false);
            }

            public void removeGraph(string userId, string botId, string endUserId, Ice.Context context__)
            {
                removeGraph(userId, botId, endUserId, context__, true);
            }

            private void removeGraph(string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeGraph");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeGraph(userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removePredicate(string name, string userId, string botId, string endUserId)
            {
                removePredicate(name, userId, botId, endUserId, null, false);
            }

            public void removePredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                removePredicate(name, userId, botId, endUserId, context__, true);
            }

            private void removePredicate(string name, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removePredicate");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removePredicate(name, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeString(string stringContainingAIML, string userId, string botId, string endUserId)
            {
                removeString(stringContainingAIML, userId, botId, endUserId, null, false);
            }

            public void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__)
            {
                removeString(stringContainingAIML, userId, botId, endUserId, context__, true);
            }

            private void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeString");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeString(stringContainingAIML, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void removeUser(string userId)
            {
                removeUser(userId, null, false);
            }

            public void removeUser(string userId, Ice.Context context__)
            {
                removeUser(userId, context__, true);
            }

            private void removeUser(string userId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("removeUser");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.removeUser(userId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setAIMLSchema(string schema)
            {
                setAIMLSchema(schema, null, false);
            }

            public void setAIMLSchema(string schema, Ice.Context context__)
            {
                setAIMLSchema(schema, context__, true);
            }

            private void setAIMLSchema(string schema, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setAIMLSchema");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setAIMLSchema(schema, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setAIMLValidation(bool trueOrFalse)
            {
                setAIMLValidation(trueOrFalse, null, false);
            }

            public void setAIMLValidation(bool trueOrFalse, Ice.Context context__)
            {
                setAIMLValidation(trueOrFalse, context__, true);
            }

            private void setAIMLValidation(bool trueOrFalse, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setAIMLValidation");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setAIMLValidation(trueOrFalse, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setAddStringAIMLFooter(string aimlFooter)
            {
                setAddStringAIMLFooter(aimlFooter, null, false);
            }

            public void setAddStringAIMLFooter(string aimlFooter, Ice.Context context__)
            {
                setAddStringAIMLFooter(aimlFooter, context__, true);
            }

            private void setAddStringAIMLFooter(string aimlFooter, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setAddStringAIMLFooter");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setAddStringAIMLFooter(aimlFooter, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setAddStringAIMLHeader(string aimlHeader)
            {
                setAddStringAIMLHeader(aimlHeader, null, false);
            }

            public void setAddStringAIMLHeader(string aimlHeader, Ice.Context context__)
            {
                setAddStringAIMLHeader(aimlHeader, context__, true);
            }

            private void setAddStringAIMLHeader(string aimlHeader, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setAddStringAIMLHeader");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setAddStringAIMLHeader(aimlHeader, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setBotConfigurationSchema(string schema)
            {
                setBotConfigurationSchema(schema, null, false);
            }

            public void setBotConfigurationSchema(string schema, Ice.Context context__)
            {
                setBotConfigurationSchema(schema, context__, true);
            }

            private void setBotConfigurationSchema(string schema, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setBotConfigurationSchema");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setBotConfigurationSchema(schema, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setBotConfigurationValidation(bool trueOrFalse)
            {
                setBotConfigurationValidation(trueOrFalse, null, false);
            }

            public void setBotConfigurationValidation(bool trueOrFalse, Ice.Context context__)
            {
                setBotConfigurationValidation(trueOrFalse, context__, true);
            }

            private void setBotConfigurationValidation(bool trueOrFalse, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setBotConfigurationValidation");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setBotConfigurationValidation(trueOrFalse, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setBotPredicate(string name, string value, string userId, string botId, string endUserId)
            {
                setBotPredicate(name, value, userId, botId, endUserId, null, false);
            }

            public void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__)
            {
                setBotPredicate(name, value, userId, botId, endUserId, context__, true);
            }

            private void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setBotPredicate");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setBotPredicate(name, value, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setCallBacks(string name, string category)
            {
                setCallBacks(name, category, null, false);
            }

            public void setCallBacks(string name, string category, Ice.Context context__)
            {
                setCallBacks(name, category, context__, true);
            }

            private void setCallBacks(string name, string category, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setCallBacks");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setCallBacks(name, category, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setCommonTypesSchema(string schema)
            {
                setCommonTypesSchema(schema, null, false);
            }

            public void setCommonTypesSchema(string schema, Ice.Context context__)
            {
                setCommonTypesSchema(schema, context__, true);
            }

            private void setCommonTypesSchema(string schema, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setCommonTypesSchema");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setCommonTypesSchema(schema, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setGenderSubstitution(string find, string replace)
            {
                setGenderSubstitution(find, replace, null, false);
            }

            public void setGenderSubstitution(string find, string replace, Ice.Context context__)
            {
                setGenderSubstitution(find, replace, context__, true);
            }

            private void setGenderSubstitution(string find, string replace, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setGenderSubstitution");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setGenderSubstitution(find, replace, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setInputSubstitution(string find, string replace)
            {
                setInputSubstitution(find, replace, null, false);
            }

            public void setInputSubstitution(string find, string replace, Ice.Context context__)
            {
                setInputSubstitution(find, replace, context__, true);
            }

            private void setInputSubstitution(string find, string replace, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setInputSubstitution");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setInputSubstitution(find, replace, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setPerson2Substitution(string find, string replace)
            {
                setPerson2Substitution(find, replace, null, false);
            }

            public void setPerson2Substitution(string find, string replace, Ice.Context context__)
            {
                setPerson2Substitution(find, replace, context__, true);
            }

            private void setPerson2Substitution(string find, string replace, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setPerson2Substitution");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setPerson2Substitution(find, replace, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setPersonSubstitution(string find, string replace)
            {
                setPersonSubstitution(find, replace, null, false);
            }

            public void setPersonSubstitution(string find, string replace, Ice.Context context__)
            {
                setPersonSubstitution(find, replace, context__, true);
            }

            private void setPersonSubstitution(string find, string replace, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setPersonSubstitution");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setPersonSubstitution(find, replace, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setPredicate(string name, string value, string userId, string botId, string endUserId)
            {
                setPredicate(name, value, userId, botId, endUserId, null, false);
            }

            public void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__)
            {
                setPredicate(name, value, userId, botId, endUserId, context__, true);
            }

            private void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setPredicate");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setPredicate(name, value, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setSentenceSplitter(string splitter)
            {
                setSentenceSplitter(splitter, null, false);
            }

            public void setSentenceSplitter(string splitter, Ice.Context context__)
            {
                setSentenceSplitter(splitter, context__, true);
            }

            private void setSentenceSplitter(string splitter, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setSentenceSplitter");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setSentenceSplitter(splitter, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setThat(string that, string userId, string botId, string endUserId)
            {
                setThat(that, userId, botId, endUserId, null, false);
            }

            public void setThat(string that, string userId, string botId, string endUserId, Ice.Context context__)
            {
                setThat(that, userId, botId, endUserId, context__, true);
            }

            private void setThat(string that, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setThat");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setThat(that, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void setTopic(string topic, string userId, string botId, string endUserId)
            {
                setTopic(topic, userId, botId, endUserId, null, false);
            }

            public void setTopic(string topic, string userId, string botId, string endUserId, Ice.Context context__)
            {
                setTopic(topic, userId, botId, endUserId, context__, true);
            }

            private void setTopic(string topic, string userId, string botId, string endUserId, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("setTopic");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.setTopic(topic, userId, botId, endUserId, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        cnt__ = handleExceptionWrapperRelaxed__(delBase__, ex__, cnt__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void storeGossip(string gossip)
            {
                storeGossip(gossip, null, false);
            }

            public void storeGossip(string gossip, Ice.Context context__)
            {
                storeGossip(gossip, context__, true);
            }

            private void storeGossip(string gossip, Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("storeGossip");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.storeGossip(gossip, context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            public void synchronizeDatabase()
            {
                synchronizeDatabase(null, false);
            }

            public void synchronizeDatabase(Ice.Context context__)
            {
                synchronizeDatabase(context__, true);
            }

            private void synchronizeDatabase(Ice.Context context__, bool explicitContext__)
            {
                if(explicitContext__ && context__ == null)
                {
                    context__ = emptyContext_;
                }
                int cnt__ = 0;
                while(true)
                {
                    Ice.ObjectDel_ delBase__ = null;
                    try
                    {
                        checkTwowayOnly__("synchronizeDatabase");
                        delBase__ = getDelegate__();
                        NetworkGraphBuilderIceDel_ del__ = (NetworkGraphBuilderIceDel_)delBase__;
                        del__.synchronizeDatabase(context__);
                        return;
                    }
                    catch(IceInternal.LocalExceptionWrapper ex__)
                    {
                        handleExceptionWrapper__(delBase__, ex__);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        cnt__ = handleException__(delBase__, ex__, cnt__);
                    }
                }
            }

            #endregion

            #region Checked and unchecked cast operations

            public static NetworkGraphBuilderIcePrx checkedCast(Ice.ObjectPrx b)
            {
                if(b == null)
                {
                    return null;
                }
                if(b is NetworkGraphBuilderIcePrx)
                {
                    return (NetworkGraphBuilderIcePrx)b;
                }
                if(b.ice_isA("::rebecca::impl::NetworkGraphBuilderIce"))
                {
                    NetworkGraphBuilderIcePrxHelper h = new NetworkGraphBuilderIcePrxHelper();
                    h.copyFrom__(b);
                    return h;
                }
                return null;
            }

            public static NetworkGraphBuilderIcePrx checkedCast(Ice.ObjectPrx b, Ice.Context ctx)
            {
                if(b == null)
                {
                    return null;
                }
                if(b is NetworkGraphBuilderIcePrx)
                {
                    return (NetworkGraphBuilderIcePrx)b;
                }
                if(b.ice_isA("::rebecca::impl::NetworkGraphBuilderIce", ctx))
                {
                    NetworkGraphBuilderIcePrxHelper h = new NetworkGraphBuilderIcePrxHelper();
                    h.copyFrom__(b);
                    return h;
                }
                return null;
            }

            public static NetworkGraphBuilderIcePrx checkedCast(Ice.ObjectPrx b, string f)
            {
                if(b == null)
                {
                    return null;
                }
                Ice.ObjectPrx bb = b.ice_facet(f);
                try
                {
                    if(bb.ice_isA("::rebecca::impl::NetworkGraphBuilderIce"))
                    {
                        NetworkGraphBuilderIcePrxHelper h = new NetworkGraphBuilderIcePrxHelper();
                        h.copyFrom__(bb);
                        return h;
                    }
                }
                catch(Ice.FacetNotExistException)
                {
                }
                return null;
            }

            public static NetworkGraphBuilderIcePrx checkedCast(Ice.ObjectPrx b, string f, Ice.Context ctx)
            {
                if(b == null)
                {
                    return null;
                }
                Ice.ObjectPrx bb = b.ice_facet(f);
                try
                {
                    if(bb.ice_isA("::rebecca::impl::NetworkGraphBuilderIce", ctx))
                    {
                        NetworkGraphBuilderIcePrxHelper h = new NetworkGraphBuilderIcePrxHelper();
                        h.copyFrom__(bb);
                        return h;
                    }
                }
                catch(Ice.FacetNotExistException)
                {
                }
                return null;
            }

            public static NetworkGraphBuilderIcePrx uncheckedCast(Ice.ObjectPrx b)
            {
                if(b == null)
                {
                    return null;
                }
                NetworkGraphBuilderIcePrxHelper h = new NetworkGraphBuilderIcePrxHelper();
                h.copyFrom__(b);
                return h;
            }

            public static NetworkGraphBuilderIcePrx uncheckedCast(Ice.ObjectPrx b, string f)
            {
                if(b == null)
                {
                    return null;
                }
                Ice.ObjectPrx bb = b.ice_facet(f);
                NetworkGraphBuilderIcePrxHelper h = new NetworkGraphBuilderIcePrxHelper();
                h.copyFrom__(bb);
                return h;
            }

            #endregion

            #region Marshaling support

            protected override Ice.ObjectDelM_ createDelegateM__()
            {
                return new NetworkGraphBuilderIceDelM_();
            }

            protected override Ice.ObjectDelD_ createDelegateD__()
            {
                return new NetworkGraphBuilderIceDelD_();
            }

            public static void write__(IceInternal.BasicStream os__, NetworkGraphBuilderIcePrx v__)
            {
                os__.writeProxy(v__);
            }

            public static NetworkGraphBuilderIcePrx read__(IceInternal.BasicStream is__)
            {
                Ice.ObjectPrx proxy = is__.readProxy();
                if(proxy != null)
                {
                    NetworkGraphBuilderIcePrxHelper result = new NetworkGraphBuilderIcePrxHelper();
                    result.copyFrom__(proxy);
                    return result;
                }
                return null;
            }

            #endregion
        }
    }
}

namespace rebecca
{
    namespace impl
    {
        public interface CallBacksIceDel_ : Ice.ObjectDel_
        {
            void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Context context__);

            void categoryLoaded(string userId, string botId, string endUserId, Ice.Context context__);

            void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__);

            void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__);

            void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Context context__);

            void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Context context__);

            void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__);

            void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__);

            void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Context context__);
        }

        public interface NetworkGraphBuilderIceDel_ : Ice.ObjectDel_
        {
            void addFile(string file, string userId, string botId, string endUserId, Ice.Context context__);

            void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Context context__);

            void removeFile(string file, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Context context__);

            void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__);

            void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__);

            void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__);

            void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__);

            void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__);

            void setAddStringAIMLHeader(string aimlHeader, Ice.Context context__);

            void setAddStringAIMLFooter(string aimlFooter, Ice.Context context__);

            void setAIMLSchema(string schema, Ice.Context context__);

            void setCommonTypesSchema(string schema, Ice.Context context__);

            void setAIMLValidation(bool trueOrFalse, Ice.Context context__);

            string getResponse(string input, string userId, string botId, string endUserId, Ice.Context context__);

            void setThat(string that, string userId, string botId, string endUserId, Ice.Context context__);

            void setTopic(string topic, string userId, string botId, string endUserId, Ice.Context context__);

            string getThat(string userId, string botId, string endUserId, Ice.Context context__);

            string getTopic(string userId, string botId, string endUserId, Ice.Context context__);

            void createGraph(string userId, string botId, string endUserId, Ice.Context context__);

            void removeGraph(string userId, string botId, string endUserId, Ice.Context context__);

            bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Context context__);

            void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__);

            string getPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__);

            string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Context context__);

            string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Context context__);

            void setBotConfigurationSchema(string schema, Ice.Context context__);

            void setBotConfigurationValidation(bool trueOrFalse, Ice.Context context__);

            void parseSubstitutionFile(string fileName, Ice.Context context__);

            void parseSentenceSplitterFile(string fileName, Ice.Context context__);

            void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Context context__);

            void setSentenceSplitter(string splitter, Ice.Context context__);

            void setInputSubstitution(string find, string replace, Ice.Context context__);

            void setGenderSubstitution(string find, string replace, Ice.Context context__);

            void setPersonSubstitution(string find, string replace, Ice.Context context__);

            void setPerson2Substitution(string find, string replace, Ice.Context context__);

            string getVersion(Ice.Context context__);

            int getSize(string userId, string botId, string endUserId, Ice.Context context__);

            void setCallBacks(string name, string category, Ice.Context context__);

            void storeGossip(string gossip, Ice.Context context__);

            string getId(Ice.Context context__);

            void addCustomTagLibrary(string library, Ice.Context context__);

            void removeCustomTagLibrary(string library, Ice.Context context__);

            string callSystemCommand(string command, Ice.Context context__);

            void synchronizeDatabase(Ice.Context context__);

            string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Context context__);

            int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Context context__);

            string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Context context__);

            int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Context context__);

            string[] getUserIds(Ice.Context context__);

            int getUserIdsSize(Ice.Context context__);

            string[] getBotIds(string userId, Ice.Context context__);

            int getBotIdsSize(string userId, Ice.Context context__);

            string[] getEndUserIds(string userId, string botId, Ice.Context context__);

            int getEndUserIdsSize(string userId, string botId, Ice.Context context__);

            void printEntireDatabase(Ice.Context context__);

            string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Context context__);

            string[] getPredicates(string userId, string botId, string endUserId, Ice.Context context__);

            int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__);

            int getPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__);

            void removePredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__);

            void removeEndUser(string userId, string botId, string endUserId, Ice.Context context__);

            void removeBot(string userId, string botId, Ice.Context context__);

            void removeUser(string userId, Ice.Context context__);
        }
    }
}

namespace rebecca
{
    namespace impl
    {
        public sealed class CallBacksIceDelM_ : Ice.ObjectDelM_, CallBacksIceDel_
        {
            public void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("XMLParseError", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("XMLParseFatalError", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("XMLParseWarning", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void categoryLoaded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("categoryLoaded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("filePostLoad", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(fileName);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("filePreLoad", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(fileName);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("infiniteSymbolicReduction", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("inputTagNumericConversionError", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("inputTagSizeExceeded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("learnTagFileNotFound", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("starTagNumericConversionError", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("starTagSizeExceeded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("storeGossip", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(gossip);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("symbolicReduction", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(symbol);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("thatStarTagNumericConversionError", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("thatStarTagSizeExceeded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("thatTagNumericConversionError", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("thatTagSizeExceeded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("topicStarTagNumericConversionError", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(message);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("topicStarTagSizeExceeded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }
        }

        public sealed class NetworkGraphBuilderIceDelM_ : Ice.ObjectDelM_, NetworkGraphBuilderIceDel_
        {
            public void addCustomTagLibrary(string library, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addCustomTagLibrary", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(library);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addDirectory", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(directory);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.DirectoryNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addDirectoryUnlessAlreadyAdded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(directory);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.DirectoryNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(directory);
                        os__.writeString(regularExpression);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.DirectoryNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(directory);
                        os__.writeString(regularExpression);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.DirectoryNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void addFile(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addFile", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(file);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addFileUnlessAlreadyAdded", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(file);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("addString", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(stringContainingAIML);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string callSystemCommand(string command, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("callSystemCommand", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(command);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void createGraph(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("createGraph", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.XMLErrorExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getAIMLFileList", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string[] ret__;
                        ret__ = is__.readStringSeq();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getAIMLFileListSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getAIMLStringList", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string[] ret__;
                        ret__ = is__.readStringSeq();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getAIMLStringListSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string[] getBotIds(string userId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getBotIds", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string[] ret__;
                        ret__ = is__.readStringSeq();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getBotIdsSize(string userId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getBotIdsSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getBotPredicate", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(name);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getBotPredicates", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string[] ret__;
                        ret__ = is__.readStringSeq();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getBotPredicatesSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string[] getEndUserIds(string userId, string botId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getEndUserIds", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string[] ret__;
                        ret__ = is__.readStringSeq();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getEndUserIdsSize(string userId, string botId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getEndUserIdsSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getId(Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getId", Ice.OperationMode.Idempotent, context__);
                try
                {
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getPredicate", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(name);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string[] getPredicates(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getPredicates", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string[] ret__;
                        ret__ = is__.readStringSeq();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getPredicatesSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getPreviousBotResponse", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeInt(previousBotResponse);
                        os__.writeInt(sentence);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getPreviousUserInput", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeInt(previousUserInput);
                        os__.writeInt(sentence);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getResponse(string input, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getResponse", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(input);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getThat(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getThat", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getTopic(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getTopic", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string[] getUserIds(Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getUserIds", Ice.OperationMode.Idempotent, context__);
                try
                {
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string[] ret__;
                        ret__ = is__.readStringSeq();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public int getUserIdsSize(Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getUserIdsSize", Ice.OperationMode.Idempotent, context__);
                try
                {
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        int ret__;
                        ret__ = is__.readInt();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public string getVersion(Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("getVersion", Ice.OperationMode.Idempotent, context__);
                try
                {
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        string ret__;
                        ret__ = is__.readString();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("parsePropertiesFile", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(fileName);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.XMLErrorExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void parseSentenceSplitterFile(string fileName, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("parseSentenceSplitterFile", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(fileName);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.XMLErrorExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void parseSubstitutionFile(string fileName, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("parseSubstitutionFile", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(fileName);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.XMLErrorExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("predicateMatch", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(predicateName);
                        os__.writeString(aimlPattern);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                        bool ret__;
                        ret__ = is__.readBool();
                        return ret__;
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void printEntireDatabase(Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("printEntireDatabase", Ice.OperationMode.Idempotent, context__);
                try
                {
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeBot(string userId, string botId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeBot", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeBotPredicate", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(name);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeCustomTagLibrary(string library, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeCustomTagLibrary", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(library);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeDirectory", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(directory);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.DirectoryNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(directory);
                        os__.writeString(regularExpression);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.DirectoryNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeEndUser(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeEndUser", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeFile(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeFile", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(file);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeGraph(string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeGraph", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.XMLErrorExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removePredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removePredicate", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(name);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeString", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(stringContainingAIML);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void removeUser(string userId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("removeUser", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(userId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setAIMLSchema(string schema, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setAIMLSchema", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(schema);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setAIMLValidation(bool trueOrFalse, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setAIMLValidation", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeBool(trueOrFalse);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setAddStringAIMLFooter(string aimlFooter, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setAddStringAIMLFooter", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(aimlFooter);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setAddStringAIMLHeader(string aimlHeader, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setAddStringAIMLHeader", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(aimlHeader);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setBotConfigurationSchema(string schema, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setBotConfigurationSchema", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(schema);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setBotConfigurationValidation(bool trueOrFalse, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setBotConfigurationValidation", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeBool(trueOrFalse);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setBotPredicate", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(name);
                        os__.writeString(value);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setCallBacks(string name, string category, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setCallBacks", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(name);
                        os__.writeString(category);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setCommonTypesSchema(string schema, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setCommonTypesSchema", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(schema);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.FileNotFoundExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setGenderSubstitution(string find, string replace, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setGenderSubstitution", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(find);
                        os__.writeString(replace);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setInputSubstitution(string find, string replace, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setInputSubstitution", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(find);
                        os__.writeString(replace);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setPerson2Substitution(string find, string replace, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setPerson2Substitution", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(find);
                        os__.writeString(replace);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setPersonSubstitution(string find, string replace, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setPersonSubstitution", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(find);
                        os__.writeString(replace);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.IllegalArgumentExceptionIce)
                            {
                                throw;
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setPredicate", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(name);
                        os__.writeString(value);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setSentenceSplitter(string splitter, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setSentenceSplitter", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(splitter);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setThat(string that, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setThat", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(that);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void setTopic(string topic, string userId, string botId, string endUserId, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("setTopic", Ice.OperationMode.Idempotent, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(topic);
                        os__.writeString(userId);
                        os__.writeString(botId);
                        os__.writeString(endUserId);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void storeGossip(string gossip, Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("storeGossip", Ice.OperationMode.Normal, context__);
                try
                {
                    try
                    {
                        IceInternal.BasicStream os__ = og__.ostr();
                        os__.writeString(gossip);
                    }
                    catch(Ice.LocalException ex__)
                    {
                        og__.abort(ex__);
                    }
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }

            public void synchronizeDatabase(Ice.Context context__)
            {
                IceInternal.Outgoing og__ = getOutgoing("synchronizeDatabase", Ice.OperationMode.Normal, context__);
                try
                {
                    bool ok__ = og__.invoke();
                    try
                    {
                        IceInternal.BasicStream is__ = og__.istr();
                        if(!ok__)
                        {
                            try
                            {
                                is__.throwException();
                            }
                            catch(rebecca.impl.ExceptionIce)
                            {
                                throw;
                            }
                            catch(Ice.UserException ex)
                            {
                                throw new Ice.UnknownUserException(ex);
                            }
                        }
                    }
                    catch(Ice.LocalException ex__)
                    {
                        throw new IceInternal.LocalExceptionWrapper(ex__, false);
                    }
                }
                finally
                {
                    reclaimOutgoing(og__);
                }
            }
        }
    }
}

namespace rebecca
{
    namespace impl
    {
        public sealed class CallBacksIceDelD_ : Ice.ObjectDelD_, CallBacksIceDel_
        {
            public void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "XMLParseError", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).XMLParseError(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "XMLParseFatalError", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).XMLParseFatalError(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "XMLParseWarning", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).XMLParseWarning(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void categoryLoaded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "categoryLoaded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).categoryLoaded(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "filePostLoad", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).filePostLoad(fileName, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "filePreLoad", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).filePreLoad(fileName, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "infiniteSymbolicReduction", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).infiniteSymbolicReduction(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "inputTagNumericConversionError", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).inputTagNumericConversionError(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "inputTagSizeExceeded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).inputTagSizeExceeded(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "learnTagFileNotFound", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).learnTagFileNotFound(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "starTagNumericConversionError", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).starTagNumericConversionError(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "starTagSizeExceeded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).starTagSizeExceeded(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "storeGossip", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).storeGossip(gossip, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "symbolicReduction", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).symbolicReduction(symbol, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "thatStarTagNumericConversionError", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).thatStarTagNumericConversionError(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "thatStarTagSizeExceeded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).thatStarTagSizeExceeded(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "thatTagNumericConversionError", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).thatTagNumericConversionError(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "thatTagSizeExceeded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).thatTagSizeExceeded(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "topicStarTagNumericConversionError", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).topicStarTagNumericConversionError(message, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "topicStarTagSizeExceeded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is CallBacksIce)
                    {
                        try
                        {
                            ((rebecca.impl.CallBacksIce)servant__).topicStarTagSizeExceeded(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }
        }

        public sealed class NetworkGraphBuilderIceDelD_ : Ice.ObjectDelD_, NetworkGraphBuilderIceDel_
        {
            public void addCustomTagLibrary(string library, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addCustomTagLibrary", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addCustomTagLibrary(library, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addDirectory", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addDirectory(directory, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addDirectoryUnlessAlreadyAdded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void addFile(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addFile", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addFile(file, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addFileUnlessAlreadyAdded", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addFileUnlessAlreadyAdded(file, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "addString", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).addString(stringContainingAIML, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string callSystemCommand(string command, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "callSystemCommand", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).callSystemCommand(command, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void createGraph(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "createGraph", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).createGraph(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getAIMLFileList", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getAIMLFileList(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getAIMLFileListSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getAIMLFileListSize(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getAIMLStringList", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getAIMLStringList(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getAIMLStringListSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getAIMLStringListSize(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string[] getBotIds(string userId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getBotIds", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getBotIds(userId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getBotIdsSize(string userId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getBotIdsSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getBotIdsSize(userId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getBotPredicate", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getBotPredicate(name, userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getBotPredicates", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getBotPredicates(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getBotPredicatesSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getBotPredicatesSize(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string[] getEndUserIds(string userId, string botId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getEndUserIds", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getEndUserIds(userId, botId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getEndUserIdsSize(string userId, string botId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getEndUserIdsSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getEndUserIdsSize(userId, botId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getId(Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getId", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getId(current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getPredicate", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getPredicate(name, userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string[] getPredicates(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getPredicates", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getPredicates(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getPredicatesSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getPredicatesSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getPredicatesSize(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getPreviousBotResponse", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getPreviousUserInput", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getResponse(string input, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getResponse", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getResponse(input, userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getSize(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getSize(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getThat(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getThat", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getThat(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getTopic(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getTopic", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getTopic(userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string[] getUserIds(Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getUserIds", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getUserIds(current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public int getUserIdsSize(Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getUserIdsSize", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getUserIdsSize(current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public string getVersion(Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "getVersion", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).getVersion(current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "parsePropertiesFile", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).parsePropertiesFile(fileName, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void parseSentenceSplitterFile(string fileName, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "parseSentenceSplitterFile", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).parseSentenceSplitterFile(fileName, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void parseSubstitutionFile(string fileName, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "parseSubstitutionFile", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).parseSubstitutionFile(fileName, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "predicateMatch", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            return ((rebecca.impl.NetworkGraphBuilderIce)servant__).predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, current__);
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void printEntireDatabase(Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "printEntireDatabase", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).printEntireDatabase(current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeBot(string userId, string botId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeBot", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeBot(userId, botId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeBotPredicate", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeBotPredicate(name, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeCustomTagLibrary(string library, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeCustomTagLibrary", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeCustomTagLibrary(library, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeDirectory", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeDirectory(directory, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeDirectoryWithFilesEndingInRegularExpression", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeEndUser(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeEndUser", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeEndUser(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeFile(string file, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeFile", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeFile(file, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeGraph(string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeGraph", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeGraph(userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removePredicate(string name, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removePredicate", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removePredicate(name, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeString", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeString(stringContainingAIML, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void removeUser(string userId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "removeUser", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).removeUser(userId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setAIMLSchema(string schema, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setAIMLSchema", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setAIMLSchema(schema, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setAIMLValidation(bool trueOrFalse, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setAIMLValidation", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setAIMLValidation(trueOrFalse, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setAddStringAIMLFooter(string aimlFooter, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setAddStringAIMLFooter", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setAddStringAIMLFooter(aimlFooter, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setAddStringAIMLHeader(string aimlHeader, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setAddStringAIMLHeader", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setAddStringAIMLHeader(aimlHeader, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setBotConfigurationSchema(string schema, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setBotConfigurationSchema", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setBotConfigurationSchema(schema, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setBotConfigurationValidation(bool trueOrFalse, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setBotConfigurationValidation", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setBotConfigurationValidation(trueOrFalse, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setBotPredicate", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setBotPredicate(name, value, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setCallBacks(string name, string category, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setCallBacks", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setCallBacks(name, category, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setCommonTypesSchema(string schema, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setCommonTypesSchema", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setCommonTypesSchema(schema, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setGenderSubstitution(string find, string replace, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setGenderSubstitution", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setGenderSubstitution(find, replace, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setInputSubstitution(string find, string replace, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setInputSubstitution", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setInputSubstitution(find, replace, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setPerson2Substitution(string find, string replace, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setPerson2Substitution", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setPerson2Substitution(find, replace, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setPersonSubstitution(string find, string replace, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setPersonSubstitution", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setPersonSubstitution(find, replace, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setPredicate", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setPredicate(name, value, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setSentenceSplitter(string splitter, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setSentenceSplitter", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setSentenceSplitter(splitter, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setThat(string that, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setThat", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setThat(that, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void setTopic(string topic, string userId, string botId, string endUserId, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "setTopic", Ice.OperationMode.Idempotent, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).setTopic(topic, userId, botId, endUserId, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void storeGossip(string gossip, Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "storeGossip", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).storeGossip(gossip, current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }

            public void synchronizeDatabase(Ice.Context context__)
            {
                Ice.Current current__ = new Ice.Current();
                initCurrent__(ref current__, "synchronizeDatabase", Ice.OperationMode.Normal, context__);
                while(true)
                {
                    IceInternal.Direct direct__ = new IceInternal.Direct(current__);
                    object servant__ = direct__.servant();
                    if(servant__ is NetworkGraphBuilderIce)
                    {
                        try
                        {
                            ((rebecca.impl.NetworkGraphBuilderIce)servant__).synchronizeDatabase(current__);
                            return;
                        }
                        catch(Ice.LocalException ex__)
                        {
                            throw new IceInternal.LocalExceptionWrapper(ex__, false);
                        }
                        finally
                        {
                            direct__.destroy();
                        }
                    }
                    else
                    {
                        direct__.destroy();
                        Ice.OperationNotExistException opEx__ = new Ice.OperationNotExistException();
                        opEx__.id = current__.id;
                        opEx__.facet = current__.facet;
                        opEx__.operation = current__.operation;
                        throw opEx__;
                    }
                }
            }
        }
    }
}

namespace rebecca
{
    namespace impl
    {
        public abstract class CallBacksIceDisp_ : Ice.ObjectImpl, CallBacksIce
        {
            #region Slice operations

            public void storeGossip(string gossip, string userId, string botId, string endUserId)
            {
                storeGossip(gossip, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void storeGossip(string gossip, string userId, string botId, string endUserId, Ice.Current current__);

            public void categoryLoaded(string userId, string botId, string endUserId)
            {
                categoryLoaded(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void categoryLoaded(string userId, string botId, string endUserId, Ice.Current current__);

            public void filePreLoad(string fileName, string userId, string botId, string endUserId)
            {
                filePreLoad(fileName, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void filePreLoad(string fileName, string userId, string botId, string endUserId, Ice.Current current__);

            public void filePostLoad(string fileName, string userId, string botId, string endUserId)
            {
                filePostLoad(fileName, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void filePostLoad(string fileName, string userId, string botId, string endUserId, Ice.Current current__);

            public void symbolicReduction(string symbol, string userId, string botId, string endUserId)
            {
                symbolicReduction(symbol, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void symbolicReduction(string symbol, string userId, string botId, string endUserId, Ice.Current current__);

            public void infiniteSymbolicReduction(string userId, string botId, string endUserId)
            {
                infiniteSymbolicReduction(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void infiniteSymbolicReduction(string userId, string botId, string endUserId, Ice.Current current__);

            public void XMLParseError(string message, string userId, string botId, string endUserId)
            {
                XMLParseError(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void XMLParseError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void XMLParseWarning(string message, string userId, string botId, string endUserId)
            {
                XMLParseWarning(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void XMLParseWarning(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void XMLParseFatalError(string message, string userId, string botId, string endUserId)
            {
                XMLParseFatalError(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void XMLParseFatalError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void thatStarTagSizeExceeded(string userId, string botId, string endUserId)
            {
                thatStarTagSizeExceeded(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void thatStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            public void topicStarTagSizeExceeded(string userId, string botId, string endUserId)
            {
                topicStarTagSizeExceeded(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void topicStarTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            public void starTagSizeExceeded(string userId, string botId, string endUserId)
            {
                starTagSizeExceeded(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void starTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            public void inputTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                inputTagNumericConversionError(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void inputTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void inputTagSizeExceeded(string userId, string botId, string endUserId)
            {
                inputTagSizeExceeded(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void inputTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            public void starTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                starTagNumericConversionError(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void starTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void thatTagSizeExceeded(string userId, string botId, string endUserId)
            {
                thatTagSizeExceeded(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void thatTagSizeExceeded(string userId, string botId, string endUserId, Ice.Current current__);

            public void thatTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                thatTagNumericConversionError(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void thatTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                topicStarTagNumericConversionError(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void topicStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId)
            {
                thatStarTagNumericConversionError(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void thatStarTagNumericConversionError(string message, string userId, string botId, string endUserId, Ice.Current current__);

            public void learnTagFileNotFound(string message, string userId, string botId, string endUserId)
            {
                learnTagFileNotFound(message, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void learnTagFileNotFound(string message, string userId, string botId, string endUserId, Ice.Current current__);

            #endregion

            #region Slice type-related members

            public static new string[] ids__ = 
            {
                "::Ice::Object",
                "::rebecca::impl::CallBacksIce"
            };

            public override bool ice_isA(string s)
            {
                if(IceInternal.AssemblyUtil.runtime_ == IceInternal.AssemblyUtil.Runtime.Mono)
                {
                    // Mono bug: System.Array.BinarySearch() uses the wrong collation sequence,
                    // so we do a linear search for the time being
                    int pos = 0;
                    while(pos < ids__.Length)
                    {
                        if(ids__[pos] == s)
                        {
                            break;
                        }
                        ++pos;
                    }
                    if(pos == ids__.Length)
                    {
                        pos = -1;
                    }
                    return pos >= 0;
                }
                else
                {
                    return _System.Array.BinarySearch(ids__, s, _System.Collections.Comparer.DefaultInvariant) >= 0;
                }
            }

            public override bool ice_isA(string s, Ice.Current current__)
            {
                if(IceInternal.AssemblyUtil.runtime_ == IceInternal.AssemblyUtil.Runtime.Mono)
                {
                    // Mono bug: System.Array.BinarySearch() uses the wrong collation sequence,
                    // so we do a linear search for the time being
                    int pos = 0;
                    while(pos < ids__.Length)
                    {
                        if(ids__[pos] == s)
                        {
                            break;
                        }
                        ++pos;
                    }
                    if(pos == ids__.Length)
                    {
                        pos = -1;
                    }
                    return pos >= 0;
                }
                else
                {
                    return _System.Array.BinarySearch(ids__, s, _System.Collections.Comparer.DefaultInvariant) >= 0;
                }
            }

            public override string[] ice_ids()
            {
                return ids__;
            }

            public override string[] ice_ids(Ice.Current current__)
            {
                return ids__;
            }

            public override string ice_id()
            {
                return ids__[1];
            }

            public override string ice_id(Ice.Current current__)
            {
                return ids__[1];
            }

            public static new string ice_staticId()
            {
                return ids__[1];
            }

            #endregion

            #region Operation dispatch

            public static IceInternal.DispatchStatus storeGossip___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string gossip;
                gossip = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.storeGossip(gossip, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus categoryLoaded___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.categoryLoaded(userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus filePreLoad___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string fileName;
                fileName = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.filePreLoad(fileName, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus filePostLoad___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string fileName;
                fileName = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.filePostLoad(fileName, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus symbolicReduction___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string symbol;
                symbol = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.symbolicReduction(symbol, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus infiniteSymbolicReduction___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.infiniteSymbolicReduction(userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus XMLParseError___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.XMLParseError(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus XMLParseWarning___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.XMLParseWarning(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus XMLParseFatalError___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.XMLParseFatalError(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus thatStarTagSizeExceeded___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.thatStarTagSizeExceeded(userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus topicStarTagSizeExceeded___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.topicStarTagSizeExceeded(userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus starTagSizeExceeded___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.starTagSizeExceeded(userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus inputTagNumericConversionError___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.inputTagNumericConversionError(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus inputTagSizeExceeded___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.inputTagSizeExceeded(userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus starTagNumericConversionError___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.starTagNumericConversionError(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus thatTagSizeExceeded___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.thatTagSizeExceeded(userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus thatTagNumericConversionError___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.thatTagNumericConversionError(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus topicStarTagNumericConversionError___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.topicStarTagNumericConversionError(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus thatStarTagNumericConversionError___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.thatStarTagNumericConversionError(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            public static IceInternal.DispatchStatus learnTagFileNotFound___(CallBacksIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                string message;
                message = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                obj__.learnTagFileNotFound(message, userId, botId, endUserId, current__);
                return IceInternal.DispatchStatus.DispatchOK;
            }

            private static string[] all__ =
            {
                "categoryLoaded",
                "filePostLoad",
                "filePreLoad",
                "ice_id",
                "ice_ids",
                "ice_isA",
                "ice_ping",
                "infiniteSymbolicReduction",
                "inputTagNumericConversionError",
                "inputTagSizeExceeded",
                "learnTagFileNotFound",
                "starTagNumericConversionError",
                "starTagSizeExceeded",
                "storeGossip",
                "symbolicReduction",
                "thatStarTagNumericConversionError",
                "thatStarTagSizeExceeded",
                "thatTagNumericConversionError",
                "thatTagSizeExceeded",
                "topicStarTagNumericConversionError",
                "topicStarTagSizeExceeded",
                "XMLParseError",
                "XMLParseFatalError",
                "XMLParseWarning"
            };

            public override IceInternal.DispatchStatus dispatch__(IceInternal.Incoming inS__, Ice.Current current__)
            {
                int pos;
                if(IceInternal.AssemblyUtil.runtime_ == IceInternal.AssemblyUtil.Runtime.Mono)
                {
                    // Mono bug: System.Array.BinarySearch() uses the wrong collation sequence,
                    // so we do a linear search for the time being
                    pos = 0;
                    while(pos < all__.Length)
                    {
                        if(all__[pos] == current__.operation)
                        {
                            break;
                        }
                        ++pos;
                    }
                    if(pos == all__.Length)
                    {
                        pos = -1;
                    }
                }
                else
                {
                    pos = _System.Array.BinarySearch(all__, current__.operation, _System.Collections.Comparer.DefaultInvariant);
                }
                if(pos < 0)
                {
                    return IceInternal.DispatchStatus.DispatchOperationNotExist;
                }

                switch(pos)
                {
                    case 0:
                    {
                        return categoryLoaded___(this, inS__, current__);
                    }
                    case 1:
                    {
                        return filePostLoad___(this, inS__, current__);
                    }
                    case 2:
                    {
                        return filePreLoad___(this, inS__, current__);
                    }
                    case 3:
                    {
                        return ice_id___(this, inS__, current__);
                    }
                    case 4:
                    {
                        return ice_ids___(this, inS__, current__);
                    }
                    case 5:
                    {
                        return ice_isA___(this, inS__, current__);
                    }
                    case 6:
                    {
                        return ice_ping___(this, inS__, current__);
                    }
                    case 7:
                    {
                        return infiniteSymbolicReduction___(this, inS__, current__);
                    }
                    case 8:
                    {
                        return inputTagNumericConversionError___(this, inS__, current__);
                    }
                    case 9:
                    {
                        return inputTagSizeExceeded___(this, inS__, current__);
                    }
                    case 10:
                    {
                        return learnTagFileNotFound___(this, inS__, current__);
                    }
                    case 11:
                    {
                        return starTagNumericConversionError___(this, inS__, current__);
                    }
                    case 12:
                    {
                        return starTagSizeExceeded___(this, inS__, current__);
                    }
                    case 13:
                    {
                        return storeGossip___(this, inS__, current__);
                    }
                    case 14:
                    {
                        return symbolicReduction___(this, inS__, current__);
                    }
                    case 15:
                    {
                        return thatStarTagNumericConversionError___(this, inS__, current__);
                    }
                    case 16:
                    {
                        return thatStarTagSizeExceeded___(this, inS__, current__);
                    }
                    case 17:
                    {
                        return thatTagNumericConversionError___(this, inS__, current__);
                    }
                    case 18:
                    {
                        return thatTagSizeExceeded___(this, inS__, current__);
                    }
                    case 19:
                    {
                        return topicStarTagNumericConversionError___(this, inS__, current__);
                    }
                    case 20:
                    {
                        return topicStarTagSizeExceeded___(this, inS__, current__);
                    }
                    case 21:
                    {
                        return XMLParseError___(this, inS__, current__);
                    }
                    case 22:
                    {
                        return XMLParseFatalError___(this, inS__, current__);
                    }
                    case 23:
                    {
                        return XMLParseWarning___(this, inS__, current__);
                    }
                }

                _System.Diagnostics.Debug.Assert(false);
                return IceInternal.DispatchStatus.DispatchOperationNotExist;
            }

            #endregion

            #region Marshaling support

            public override void write__(IceInternal.BasicStream os__)
            {
                os__.writeTypeId(ice_staticId());
                os__.startWriteSlice();
                os__.endWriteSlice();
                base.write__(os__);
            }

            public override void read__(IceInternal.BasicStream is__, bool rid__)
            {
                if(rid__)
                {
                    /* string myId = */ is__.readTypeId();
                }
                is__.startReadSlice();
                is__.endReadSlice();
                base.read__(is__, true);
            }

            public override void write__(Ice.OutputStream outS__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "type rebecca::impl::CallBacksIce was not generated with stream support";
                throw ex;
            }

            public override void read__(Ice.InputStream inS__, bool rid__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "type rebecca::impl::CallBacksIce was not generated with stream support";
                throw ex;
            }

            #endregion
        }

        public abstract class NetworkGraphBuilderIceDisp_ : Ice.ObjectImpl, NetworkGraphBuilderIce
        {
            #region Slice operations

            public void addFile(string file, string userId, string botId, string endUserId)
            {
                addFile(file, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addFile(string file, string userId, string botId, string endUserId, Ice.Current current__);

            public void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId)
            {
                addFileUnlessAlreadyAdded(file, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addFileUnlessAlreadyAdded(string file, string userId, string botId, string endUserId, Ice.Current current__);

            public void removeFile(string file, string userId, string botId, string endUserId)
            {
                removeFile(file, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeFile(string file, string userId, string botId, string endUserId, Ice.Current current__);

            public void addDirectory(string directory, string userId, string botId, string endUserId)
            {
                addDirectory(directory, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addDirectory(string directory, string userId, string botId, string endUserId, Ice.Current current__);

            public void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId)
            {
                addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Current current__);

            public void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId)
            {
                addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addDirectoryUnlessAlreadyAdded(string directory, string userId, string botId, string endUserId, Ice.Current current__);

            public void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId)
            {
                addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Current current__);

            public void removeDirectory(string directory, string userId, string botId, string endUserId)
            {
                removeDirectory(directory, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeDirectory(string directory, string userId, string botId, string endUserId, Ice.Current current__);

            public void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId)
            {
                removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeDirectoryWithFilesEndingInRegularExpression(string directory, string regularExpression, string userId, string botId, string endUserId, Ice.Current current__);

            public void addString(string stringContainingAIML, string userId, string botId, string endUserId)
            {
                addString(stringContainingAIML, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Current current__);

            public void removeString(string stringContainingAIML, string userId, string botId, string endUserId)
            {
                removeString(stringContainingAIML, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeString(string stringContainingAIML, string userId, string botId, string endUserId, Ice.Current current__);

            public void setAddStringAIMLHeader(string aimlHeader)
            {
                setAddStringAIMLHeader(aimlHeader, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setAddStringAIMLHeader(string aimlHeader, Ice.Current current__);

            public void setAddStringAIMLFooter(string aimlFooter)
            {
                setAddStringAIMLFooter(aimlFooter, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setAddStringAIMLFooter(string aimlFooter, Ice.Current current__);

            public void setAIMLSchema(string schema)
            {
                setAIMLSchema(schema, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setAIMLSchema(string schema, Ice.Current current__);

            public void setCommonTypesSchema(string schema)
            {
                setCommonTypesSchema(schema, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setCommonTypesSchema(string schema, Ice.Current current__);

            public void setAIMLValidation(bool trueOrFalse)
            {
                setAIMLValidation(trueOrFalse, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setAIMLValidation(bool trueOrFalse, Ice.Current current__);

            public string getResponse(string input, string userId, string botId, string endUserId)
            {
                return getResponse(input, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getResponse(string input, string userId, string botId, string endUserId, Ice.Current current__);

            public void setThat(string that, string userId, string botId, string endUserId)
            {
                setThat(that, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setThat(string that, string userId, string botId, string endUserId, Ice.Current current__);

            public void setTopic(string topic, string userId, string botId, string endUserId)
            {
                setTopic(topic, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setTopic(string topic, string userId, string botId, string endUserId, Ice.Current current__);

            public string getThat(string userId, string botId, string endUserId)
            {
                return getThat(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getThat(string userId, string botId, string endUserId, Ice.Current current__);

            public string getTopic(string userId, string botId, string endUserId)
            {
                return getTopic(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getTopic(string userId, string botId, string endUserId, Ice.Current current__);

            public void createGraph(string userId, string botId, string endUserId)
            {
                createGraph(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void createGraph(string userId, string botId, string endUserId, Ice.Current current__);

            public void removeGraph(string userId, string botId, string endUserId)
            {
                removeGraph(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeGraph(string userId, string botId, string endUserId, Ice.Current current__);

            public bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId)
            {
                return predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract bool predicateMatch(string predicateName, string aimlPattern, string userId, string botId, string endUserId, Ice.Current current__);

            public void setPredicate(string name, string value, string userId, string botId, string endUserId)
            {
                setPredicate(name, value, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Current current__);

            public string getPredicate(string name, string userId, string botId, string endUserId)
            {
                return getPredicate(name, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getPredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            public string getBotPredicate(string name, string userId, string botId, string endUserId)
            {
                return getBotPredicate(name, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getBotPredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            public void setBotPredicate(string name, string value, string userId, string botId, string endUserId)
            {
                setBotPredicate(name, value, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setBotPredicate(string name, string value, string userId, string botId, string endUserId, Ice.Current current__);

            public string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId)
            {
                return getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getPreviousBotResponse(int previousBotResponse, int sentence, string userId, string botId, string endUserId, Ice.Current current__);

            public string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId)
            {
                return getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getPreviousUserInput(int previousUserInput, int sentence, string userId, string botId, string endUserId, Ice.Current current__);

            public void setBotConfigurationSchema(string schema)
            {
                setBotConfigurationSchema(schema, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setBotConfigurationSchema(string schema, Ice.Current current__);

            public void setBotConfigurationValidation(bool trueOrFalse)
            {
                setBotConfigurationValidation(trueOrFalse, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setBotConfigurationValidation(bool trueOrFalse, Ice.Current current__);

            public void parseSubstitutionFile(string fileName)
            {
                parseSubstitutionFile(fileName, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void parseSubstitutionFile(string fileName, Ice.Current current__);

            public void parseSentenceSplitterFile(string fileName)
            {
                parseSentenceSplitterFile(fileName, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void parseSentenceSplitterFile(string fileName, Ice.Current current__);

            public void parsePropertiesFile(string fileName, string userId, string botId, string endUserId)
            {
                parsePropertiesFile(fileName, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void parsePropertiesFile(string fileName, string userId, string botId, string endUserId, Ice.Current current__);

            public void setSentenceSplitter(string splitter)
            {
                setSentenceSplitter(splitter, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setSentenceSplitter(string splitter, Ice.Current current__);

            public void setInputSubstitution(string find, string replace)
            {
                setInputSubstitution(find, replace, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setInputSubstitution(string find, string replace, Ice.Current current__);

            public void setGenderSubstitution(string find, string replace)
            {
                setGenderSubstitution(find, replace, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setGenderSubstitution(string find, string replace, Ice.Current current__);

            public void setPersonSubstitution(string find, string replace)
            {
                setPersonSubstitution(find, replace, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setPersonSubstitution(string find, string replace, Ice.Current current__);

            public void setPerson2Substitution(string find, string replace)
            {
                setPerson2Substitution(find, replace, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setPerson2Substitution(string find, string replace, Ice.Current current__);

            public string getVersion()
            {
                return getVersion(Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getVersion(Ice.Current current__);

            public int getSize(string userId, string botId, string endUserId)
            {
                return getSize(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getSize(string userId, string botId, string endUserId, Ice.Current current__);

            public void setCallBacks(string name, string category)
            {
                setCallBacks(name, category, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void setCallBacks(string name, string category, Ice.Current current__);

            public void storeGossip(string gossip)
            {
                storeGossip(gossip, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void storeGossip(string gossip, Ice.Current current__);

            public string getId()
            {
                return getId(Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string getId(Ice.Current current__);

            public void addCustomTagLibrary(string library)
            {
                addCustomTagLibrary(library, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void addCustomTagLibrary(string library, Ice.Current current__);

            public void removeCustomTagLibrary(string library)
            {
                removeCustomTagLibrary(library, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeCustomTagLibrary(string library, Ice.Current current__);

            public string callSystemCommand(string command)
            {
                return callSystemCommand(command, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string callSystemCommand(string command, Ice.Current current__);

            public void synchronizeDatabase()
            {
                synchronizeDatabase(Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void synchronizeDatabase(Ice.Current current__);

            public string[] getAIMLFileList(string userId, string botId, string endUserId)
            {
                return getAIMLFileList(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string[] getAIMLFileList(string userId, string botId, string endUserId, Ice.Current current__);

            public int getAIMLFileListSize(string userId, string botId, string endUserId)
            {
                return getAIMLFileListSize(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getAIMLFileListSize(string userId, string botId, string endUserId, Ice.Current current__);

            public string[] getAIMLStringList(string userId, string botId, string endUserId)
            {
                return getAIMLStringList(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string[] getAIMLStringList(string userId, string botId, string endUserId, Ice.Current current__);

            public int getAIMLStringListSize(string userId, string botId, string endUserId)
            {
                return getAIMLStringListSize(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getAIMLStringListSize(string userId, string botId, string endUserId, Ice.Current current__);

            public string[] getUserIds()
            {
                return getUserIds(Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string[] getUserIds(Ice.Current current__);

            public int getUserIdsSize()
            {
                return getUserIdsSize(Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getUserIdsSize(Ice.Current current__);

            public string[] getBotIds(string userId)
            {
                return getBotIds(userId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string[] getBotIds(string userId, Ice.Current current__);

            public int getBotIdsSize(string userId)
            {
                return getBotIdsSize(userId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getBotIdsSize(string userId, Ice.Current current__);

            public string[] getEndUserIds(string userId, string botId)
            {
                return getEndUserIds(userId, botId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string[] getEndUserIds(string userId, string botId, Ice.Current current__);

            public int getEndUserIdsSize(string userId, string botId)
            {
                return getEndUserIdsSize(userId, botId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getEndUserIdsSize(string userId, string botId, Ice.Current current__);

            public void printEntireDatabase()
            {
                printEntireDatabase(Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void printEntireDatabase(Ice.Current current__);

            public string[] getBotPredicates(string userId, string botId, string endUserId)
            {
                return getBotPredicates(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string[] getBotPredicates(string userId, string botId, string endUserId, Ice.Current current__);

            public string[] getPredicates(string userId, string botId, string endUserId)
            {
                return getPredicates(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract string[] getPredicates(string userId, string botId, string endUserId, Ice.Current current__);

            public int getBotPredicatesSize(string userId, string botId, string endUserId)
            {
                return getBotPredicatesSize(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getBotPredicatesSize(string userId, string botId, string endUserId, Ice.Current current__);

            public int getPredicatesSize(string userId, string botId, string endUserId)
            {
                return getPredicatesSize(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract int getPredicatesSize(string userId, string botId, string endUserId, Ice.Current current__);

            public void removePredicate(string name, string userId, string botId, string endUserId)
            {
                removePredicate(name, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removePredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            public void removeBotPredicate(string name, string userId, string botId, string endUserId)
            {
                removeBotPredicate(name, userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeBotPredicate(string name, string userId, string botId, string endUserId, Ice.Current current__);

            public void removeEndUser(string userId, string botId, string endUserId)
            {
                removeEndUser(userId, botId, endUserId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeEndUser(string userId, string botId, string endUserId, Ice.Current current__);

            public void removeBot(string userId, string botId)
            {
                removeBot(userId, botId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeBot(string userId, string botId, Ice.Current current__);

            public void removeUser(string userId)
            {
                removeUser(userId, Ice.ObjectImpl.defaultCurrent);
            }

            public abstract void removeUser(string userId, Ice.Current current__);

            #endregion

            #region Slice type-related members

            public static new string[] ids__ = 
            {
                "::Ice::Object",
                "::rebecca::impl::NetworkGraphBuilderIce"
            };

            public override bool ice_isA(string s)
            {
                if(IceInternal.AssemblyUtil.runtime_ == IceInternal.AssemblyUtil.Runtime.Mono)
                {
                    // Mono bug: System.Array.BinarySearch() uses the wrong collation sequence,
                    // so we do a linear search for the time being
                    int pos = 0;
                    while(pos < ids__.Length)
                    {
                        if(ids__[pos] == s)
                        {
                            break;
                        }
                        ++pos;
                    }
                    if(pos == ids__.Length)
                    {
                        pos = -1;
                    }
                    return pos >= 0;
                }
                else
                {
                    return _System.Array.BinarySearch(ids__, s, _System.Collections.Comparer.DefaultInvariant) >= 0;
                }
            }

            public override bool ice_isA(string s, Ice.Current current__)
            {
                if(IceInternal.AssemblyUtil.runtime_ == IceInternal.AssemblyUtil.Runtime.Mono)
                {
                    // Mono bug: System.Array.BinarySearch() uses the wrong collation sequence,
                    // so we do a linear search for the time being
                    int pos = 0;
                    while(pos < ids__.Length)
                    {
                        if(ids__[pos] == s)
                        {
                            break;
                        }
                        ++pos;
                    }
                    if(pos == ids__.Length)
                    {
                        pos = -1;
                    }
                    return pos >= 0;
                }
                else
                {
                    return _System.Array.BinarySearch(ids__, s, _System.Collections.Comparer.DefaultInvariant) >= 0;
                }
            }

            public override string[] ice_ids()
            {
                return ids__;
            }

            public override string[] ice_ids(Ice.Current current__)
            {
                return ids__;
            }

            public override string ice_id()
            {
                return ids__[1];
            }

            public override string ice_id(Ice.Current current__)
            {
                return ids__[1];
            }

            public static new string ice_staticId()
            {
                return ids__[1];
            }

            #endregion

            #region Operation dispatch

            public static IceInternal.DispatchStatus addFile___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string file;
                file = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.addFile(file, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus addFileUnlessAlreadyAdded___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string file;
                file = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.addFileUnlessAlreadyAdded(file, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeFile___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string file;
                file = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removeFile(file, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus addDirectory___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string directory;
                directory = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.addDirectory(directory, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.DirectoryNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus addDirectoryWithFilesEndingInRegularExpression___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string directory;
                directory = is__.readString();
                string regularExpression;
                regularExpression = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.addDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.DirectoryNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus addDirectoryUnlessAlreadyAdded___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string directory;
                directory = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.addDirectoryUnlessAlreadyAdded(directory, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.DirectoryNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string directory;
                directory = is__.readString();
                string regularExpression;
                regularExpression = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(directory, regularExpression, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.DirectoryNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeDirectory___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string directory;
                directory = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removeDirectory(directory, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.DirectoryNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeDirectoryWithFilesEndingInRegularExpression___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string directory;
                directory = is__.readString();
                string regularExpression;
                regularExpression = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removeDirectoryWithFilesEndingInRegularExpression(directory, regularExpression, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.DirectoryNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus addString___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string stringContainingAIML;
                stringContainingAIML = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.addString(stringContainingAIML, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeString___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string stringContainingAIML;
                stringContainingAIML = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removeString(stringContainingAIML, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setAddStringAIMLHeader___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string aimlHeader;
                aimlHeader = is__.readString();
                try
                {
                    obj__.setAddStringAIMLHeader(aimlHeader, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setAddStringAIMLFooter___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string aimlFooter;
                aimlFooter = is__.readString();
                try
                {
                    obj__.setAddStringAIMLFooter(aimlFooter, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setAIMLSchema___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string schema;
                schema = is__.readString();
                try
                {
                    obj__.setAIMLSchema(schema, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setCommonTypesSchema___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string schema;
                schema = is__.readString();
                try
                {
                    obj__.setCommonTypesSchema(schema, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setAIMLValidation___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                bool trueOrFalse;
                trueOrFalse = is__.readBool();
                try
                {
                    obj__.setAIMLValidation(trueOrFalse, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getResponse___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string input;
                input = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string ret__ = obj__.getResponse(input, userId, botId, endUserId, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setThat___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string that;
                that = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.setThat(that, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setTopic___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string topic;
                topic = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.setTopic(topic, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getThat___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string ret__ = obj__.getThat(userId, botId, endUserId, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getTopic___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string ret__ = obj__.getTopic(userId, botId, endUserId, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus createGraph___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.createGraph(userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.XMLErrorExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeGraph___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removeGraph(userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.XMLErrorExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus predicateMatch___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string predicateName;
                predicateName = is__.readString();
                string aimlPattern;
                aimlPattern = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    bool ret__ = obj__.predicateMatch(predicateName, aimlPattern, userId, botId, endUserId, current__);
                    os__.writeBool(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setPredicate___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string name;
                name = is__.readString();
                string value;
                value = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.setPredicate(name, value, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getPredicate___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string name;
                name = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string ret__ = obj__.getPredicate(name, userId, botId, endUserId, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getBotPredicate___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string name;
                name = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string ret__ = obj__.getBotPredicate(name, userId, botId, endUserId, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setBotPredicate___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string name;
                name = is__.readString();
                string value;
                value = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.setBotPredicate(name, value, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getPreviousBotResponse___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                int previousBotResponse;
                previousBotResponse = is__.readInt();
                int sentence;
                sentence = is__.readInt();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string ret__ = obj__.getPreviousBotResponse(previousBotResponse, sentence, userId, botId, endUserId, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getPreviousUserInput___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                int previousUserInput;
                previousUserInput = is__.readInt();
                int sentence;
                sentence = is__.readInt();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string ret__ = obj__.getPreviousUserInput(previousUserInput, sentence, userId, botId, endUserId, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setBotConfigurationSchema___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string schema;
                schema = is__.readString();
                try
                {
                    obj__.setBotConfigurationSchema(schema, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setBotConfigurationValidation___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                bool trueOrFalse;
                trueOrFalse = is__.readBool();
                try
                {
                    obj__.setBotConfigurationValidation(trueOrFalse, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus parseSubstitutionFile___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string fileName;
                fileName = is__.readString();
                try
                {
                    obj__.parseSubstitutionFile(fileName, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.XMLErrorExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus parseSentenceSplitterFile___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string fileName;
                fileName = is__.readString();
                try
                {
                    obj__.parseSentenceSplitterFile(fileName, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.XMLErrorExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus parsePropertiesFile___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string fileName;
                fileName = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.parsePropertiesFile(fileName, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.XMLErrorExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setSentenceSplitter___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string splitter;
                splitter = is__.readString();
                try
                {
                    obj__.setSentenceSplitter(splitter, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setInputSubstitution___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string find;
                find = is__.readString();
                string replace;
                replace = is__.readString();
                try
                {
                    obj__.setInputSubstitution(find, replace, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setGenderSubstitution___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string find;
                find = is__.readString();
                string replace;
                replace = is__.readString();
                try
                {
                    obj__.setGenderSubstitution(find, replace, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setPersonSubstitution___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string find;
                find = is__.readString();
                string replace;
                replace = is__.readString();
                try
                {
                    obj__.setPersonSubstitution(find, replace, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setPerson2Substitution___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string find;
                find = is__.readString();
                string replace;
                replace = is__.readString();
                try
                {
                    obj__.setPerson2Substitution(find, replace, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.IllegalArgumentExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getVersion___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream os__ = inS__.ostr();
                try
                {
                    string ret__ = obj__.getVersion(current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    int ret__ = obj__.getSize(userId, botId, endUserId, current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus setCallBacks___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string name;
                name = is__.readString();
                string category;
                category = is__.readString();
                try
                {
                    obj__.setCallBacks(name, category, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus storeGossip___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string gossip;
                gossip = is__.readString();
                try
                {
                    obj__.storeGossip(gossip, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getId___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream os__ = inS__.ostr();
                try
                {
                    string ret__ = obj__.getId(current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus addCustomTagLibrary___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string library;
                library = is__.readString();
                try
                {
                    obj__.addCustomTagLibrary(library, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeCustomTagLibrary___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string library;
                library = is__.readString();
                try
                {
                    obj__.removeCustomTagLibrary(library, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.FileNotFoundExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus callSystemCommand___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string command;
                command = is__.readString();
                try
                {
                    string ret__ = obj__.callSystemCommand(command, current__);
                    os__.writeString(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus synchronizeDatabase___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream os__ = inS__.ostr();
                try
                {
                    obj__.synchronizeDatabase(current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getAIMLFileList___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string[] ret__ = obj__.getAIMLFileList(userId, botId, endUserId, current__);
                    os__.writeStringSeq(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getAIMLFileListSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    int ret__ = obj__.getAIMLFileListSize(userId, botId, endUserId, current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getAIMLStringList___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string[] ret__ = obj__.getAIMLStringList(userId, botId, endUserId, current__);
                    os__.writeStringSeq(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getAIMLStringListSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    int ret__ = obj__.getAIMLStringListSize(userId, botId, endUserId, current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getUserIds___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream os__ = inS__.ostr();
                try
                {
                    string[] ret__ = obj__.getUserIds(current__);
                    os__.writeStringSeq(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getUserIdsSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream os__ = inS__.ostr();
                try
                {
                    int ret__ = obj__.getUserIdsSize(current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getBotIds___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                try
                {
                    string[] ret__ = obj__.getBotIds(userId, current__);
                    os__.writeStringSeq(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getBotIdsSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                try
                {
                    int ret__ = obj__.getBotIdsSize(userId, current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getEndUserIds___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                try
                {
                    string[] ret__ = obj__.getEndUserIds(userId, botId, current__);
                    os__.writeStringSeq(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getEndUserIdsSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                try
                {
                    int ret__ = obj__.getEndUserIdsSize(userId, botId, current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus printEntireDatabase___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream os__ = inS__.ostr();
                try
                {
                    obj__.printEntireDatabase(current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getBotPredicates___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string[] ret__ = obj__.getBotPredicates(userId, botId, endUserId, current__);
                    os__.writeStringSeq(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getPredicates___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    string[] ret__ = obj__.getPredicates(userId, botId, endUserId, current__);
                    os__.writeStringSeq(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getBotPredicatesSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    int ret__ = obj__.getBotPredicatesSize(userId, botId, endUserId, current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus getPredicatesSize___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    int ret__ = obj__.getPredicatesSize(userId, botId, endUserId, current__);
                    os__.writeInt(ret__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removePredicate___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string name;
                name = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removePredicate(name, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeBotPredicate___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Idempotent, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string name;
                name = is__.readString();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removeBotPredicate(name, userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeEndUser___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                string endUserId;
                endUserId = is__.readString();
                try
                {
                    obj__.removeEndUser(userId, botId, endUserId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeBot___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                string botId;
                botId = is__.readString();
                try
                {
                    obj__.removeBot(userId, botId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            public static IceInternal.DispatchStatus removeUser___(NetworkGraphBuilderIce obj__, IceInternal.Incoming inS__, Ice.Current current__)
            {
                checkMode__(Ice.OperationMode.Normal, current__.mode);
                IceInternal.BasicStream is__ = inS__.istr();
                IceInternal.BasicStream os__ = inS__.ostr();
                string userId;
                userId = is__.readString();
                try
                {
                    obj__.removeUser(userId, current__);
                    return IceInternal.DispatchStatus.DispatchOK;
                }
                catch(rebecca.impl.ExceptionIce ex)
                {
                    os__.writeUserException(ex);
                    return IceInternal.DispatchStatus.DispatchUserException;
                }
            }

            private static string[] all__ =
            {
                "addCustomTagLibrary",
                "addDirectory",
                "addDirectoryUnlessAlreadyAdded",
                "addDirectoryWithFilesEndingInRegularExpression",
                "addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded",
                "addFile",
                "addFileUnlessAlreadyAdded",
                "addString",
                "callSystemCommand",
                "createGraph",
                "getAIMLFileList",
                "getAIMLFileListSize",
                "getAIMLStringList",
                "getAIMLStringListSize",
                "getBotIds",
                "getBotIdsSize",
                "getBotPredicate",
                "getBotPredicates",
                "getBotPredicatesSize",
                "getEndUserIds",
                "getEndUserIdsSize",
                "getId",
                "getPredicate",
                "getPredicates",
                "getPredicatesSize",
                "getPreviousBotResponse",
                "getPreviousUserInput",
                "getResponse",
                "getSize",
                "getThat",
                "getTopic",
                "getUserIds",
                "getUserIdsSize",
                "getVersion",
                "ice_id",
                "ice_ids",
                "ice_isA",
                "ice_ping",
                "parsePropertiesFile",
                "parseSentenceSplitterFile",
                "parseSubstitutionFile",
                "predicateMatch",
                "printEntireDatabase",
                "removeBot",
                "removeBotPredicate",
                "removeCustomTagLibrary",
                "removeDirectory",
                "removeDirectoryWithFilesEndingInRegularExpression",
                "removeEndUser",
                "removeFile",
                "removeGraph",
                "removePredicate",
                "removeString",
                "removeUser",
                "setAddStringAIMLFooter",
                "setAddStringAIMLHeader",
                "setAIMLSchema",
                "setAIMLValidation",
                "setBotConfigurationSchema",
                "setBotConfigurationValidation",
                "setBotPredicate",
                "setCallBacks",
                "setCommonTypesSchema",
                "setGenderSubstitution",
                "setInputSubstitution",
                "setPerson2Substitution",
                "setPersonSubstitution",
                "setPredicate",
                "setSentenceSplitter",
                "setThat",
                "setTopic",
                "storeGossip",
                "synchronizeDatabase"
            };

            public override IceInternal.DispatchStatus dispatch__(IceInternal.Incoming inS__, Ice.Current current__)
            {
                int pos;
                if(IceInternal.AssemblyUtil.runtime_ == IceInternal.AssemblyUtil.Runtime.Mono)
                {
                    // Mono bug: System.Array.BinarySearch() uses the wrong collation sequence,
                    // so we do a linear search for the time being
                    pos = 0;
                    while(pos < all__.Length)
                    {
                        if(all__[pos] == current__.operation)
                        {
                            break;
                        }
                        ++pos;
                    }
                    if(pos == all__.Length)
                    {
                        pos = -1;
                    }
                }
                else
                {
                    pos = _System.Array.BinarySearch(all__, current__.operation, _System.Collections.Comparer.DefaultInvariant);
                }
                if(pos < 0)
                {
                    return IceInternal.DispatchStatus.DispatchOperationNotExist;
                }

                switch(pos)
                {
                    case 0:
                    {
                        return addCustomTagLibrary___(this, inS__, current__);
                    }
                    case 1:
                    {
                        return addDirectory___(this, inS__, current__);
                    }
                    case 2:
                    {
                        return addDirectoryUnlessAlreadyAdded___(this, inS__, current__);
                    }
                    case 3:
                    {
                        return addDirectoryWithFilesEndingInRegularExpression___(this, inS__, current__);
                    }
                    case 4:
                    {
                        return addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded___(this, inS__, current__);
                    }
                    case 5:
                    {
                        return addFile___(this, inS__, current__);
                    }
                    case 6:
                    {
                        return addFileUnlessAlreadyAdded___(this, inS__, current__);
                    }
                    case 7:
                    {
                        return addString___(this, inS__, current__);
                    }
                    case 8:
                    {
                        return callSystemCommand___(this, inS__, current__);
                    }
                    case 9:
                    {
                        return createGraph___(this, inS__, current__);
                    }
                    case 10:
                    {
                        return getAIMLFileList___(this, inS__, current__);
                    }
                    case 11:
                    {
                        return getAIMLFileListSize___(this, inS__, current__);
                    }
                    case 12:
                    {
                        return getAIMLStringList___(this, inS__, current__);
                    }
                    case 13:
                    {
                        return getAIMLStringListSize___(this, inS__, current__);
                    }
                    case 14:
                    {
                        return getBotIds___(this, inS__, current__);
                    }
                    case 15:
                    {
                        return getBotIdsSize___(this, inS__, current__);
                    }
                    case 16:
                    {
                        return getBotPredicate___(this, inS__, current__);
                    }
                    case 17:
                    {
                        return getBotPredicates___(this, inS__, current__);
                    }
                    case 18:
                    {
                        return getBotPredicatesSize___(this, inS__, current__);
                    }
                    case 19:
                    {
                        return getEndUserIds___(this, inS__, current__);
                    }
                    case 20:
                    {
                        return getEndUserIdsSize___(this, inS__, current__);
                    }
                    case 21:
                    {
                        return getId___(this, inS__, current__);
                    }
                    case 22:
                    {
                        return getPredicate___(this, inS__, current__);
                    }
                    case 23:
                    {
                        return getPredicates___(this, inS__, current__);
                    }
                    case 24:
                    {
                        return getPredicatesSize___(this, inS__, current__);
                    }
                    case 25:
                    {
                        return getPreviousBotResponse___(this, inS__, current__);
                    }
                    case 26:
                    {
                        return getPreviousUserInput___(this, inS__, current__);
                    }
                    case 27:
                    {
                        return getResponse___(this, inS__, current__);
                    }
                    case 28:
                    {
                        return getSize___(this, inS__, current__);
                    }
                    case 29:
                    {
                        return getThat___(this, inS__, current__);
                    }
                    case 30:
                    {
                        return getTopic___(this, inS__, current__);
                    }
                    case 31:
                    {
                        return getUserIds___(this, inS__, current__);
                    }
                    case 32:
                    {
                        return getUserIdsSize___(this, inS__, current__);
                    }
                    case 33:
                    {
                        return getVersion___(this, inS__, current__);
                    }
                    case 34:
                    {
                        return ice_id___(this, inS__, current__);
                    }
                    case 35:
                    {
                        return ice_ids___(this, inS__, current__);
                    }
                    case 36:
                    {
                        return ice_isA___(this, inS__, current__);
                    }
                    case 37:
                    {
                        return ice_ping___(this, inS__, current__);
                    }
                    case 38:
                    {
                        return parsePropertiesFile___(this, inS__, current__);
                    }
                    case 39:
                    {
                        return parseSentenceSplitterFile___(this, inS__, current__);
                    }
                    case 40:
                    {
                        return parseSubstitutionFile___(this, inS__, current__);
                    }
                    case 41:
                    {
                        return predicateMatch___(this, inS__, current__);
                    }
                    case 42:
                    {
                        return printEntireDatabase___(this, inS__, current__);
                    }
                    case 43:
                    {
                        return removeBot___(this, inS__, current__);
                    }
                    case 44:
                    {
                        return removeBotPredicate___(this, inS__, current__);
                    }
                    case 45:
                    {
                        return removeCustomTagLibrary___(this, inS__, current__);
                    }
                    case 46:
                    {
                        return removeDirectory___(this, inS__, current__);
                    }
                    case 47:
                    {
                        return removeDirectoryWithFilesEndingInRegularExpression___(this, inS__, current__);
                    }
                    case 48:
                    {
                        return removeEndUser___(this, inS__, current__);
                    }
                    case 49:
                    {
                        return removeFile___(this, inS__, current__);
                    }
                    case 50:
                    {
                        return removeGraph___(this, inS__, current__);
                    }
                    case 51:
                    {
                        return removePredicate___(this, inS__, current__);
                    }
                    case 52:
                    {
                        return removeString___(this, inS__, current__);
                    }
                    case 53:
                    {
                        return removeUser___(this, inS__, current__);
                    }
                    case 54:
                    {
                        return setAddStringAIMLFooter___(this, inS__, current__);
                    }
                    case 55:
                    {
                        return setAddStringAIMLHeader___(this, inS__, current__);
                    }
                    case 56:
                    {
                        return setAIMLSchema___(this, inS__, current__);
                    }
                    case 57:
                    {
                        return setAIMLValidation___(this, inS__, current__);
                    }
                    case 58:
                    {
                        return setBotConfigurationSchema___(this, inS__, current__);
                    }
                    case 59:
                    {
                        return setBotConfigurationValidation___(this, inS__, current__);
                    }
                    case 60:
                    {
                        return setBotPredicate___(this, inS__, current__);
                    }
                    case 61:
                    {
                        return setCallBacks___(this, inS__, current__);
                    }
                    case 62:
                    {
                        return setCommonTypesSchema___(this, inS__, current__);
                    }
                    case 63:
                    {
                        return setGenderSubstitution___(this, inS__, current__);
                    }
                    case 64:
                    {
                        return setInputSubstitution___(this, inS__, current__);
                    }
                    case 65:
                    {
                        return setPerson2Substitution___(this, inS__, current__);
                    }
                    case 66:
                    {
                        return setPersonSubstitution___(this, inS__, current__);
                    }
                    case 67:
                    {
                        return setPredicate___(this, inS__, current__);
                    }
                    case 68:
                    {
                        return setSentenceSplitter___(this, inS__, current__);
                    }
                    case 69:
                    {
                        return setThat___(this, inS__, current__);
                    }
                    case 70:
                    {
                        return setTopic___(this, inS__, current__);
                    }
                    case 71:
                    {
                        return storeGossip___(this, inS__, current__);
                    }
                    case 72:
                    {
                        return synchronizeDatabase___(this, inS__, current__);
                    }
                }

                _System.Diagnostics.Debug.Assert(false);
                return IceInternal.DispatchStatus.DispatchOperationNotExist;
            }

            #endregion

            #region Marshaling support

            public override void write__(IceInternal.BasicStream os__)
            {
                os__.writeTypeId(ice_staticId());
                os__.startWriteSlice();
                os__.endWriteSlice();
                base.write__(os__);
            }

            public override void read__(IceInternal.BasicStream is__, bool rid__)
            {
                if(rid__)
                {
                    /* string myId = */ is__.readTypeId();
                }
                is__.startReadSlice();
                is__.endReadSlice();
                base.read__(is__, true);
            }

            public override void write__(Ice.OutputStream outS__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "type rebecca::impl::NetworkGraphBuilderIce was not generated with stream support";
                throw ex;
            }

            public override void read__(Ice.InputStream inS__, bool rid__)
            {
                Ice.MarshalException ex = new Ice.MarshalException();
                ex.reason = "type rebecca::impl::NetworkGraphBuilderIce was not generated with stream support";
                throw ex;
            }

            #endregion
        }
    }
}
