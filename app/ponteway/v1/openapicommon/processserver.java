package app.ponteway.v1.openapicommon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class processserver extends GXProcedure
{
   public processserver( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( processserver.class ), "" );
   }

   public processserver( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             com.genexus.util.GXProperties aP1 )
   {
      processserver.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        com.genexus.util.GXProperties aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             com.genexus.util.GXProperties aP1 ,
                             String[] aP2 )
   {
      processserver.this.AV8server = aP0;
      processserver.this.AV11varServerParams = aP1;
      processserver.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9serverPart = GXutil.trim( AV8server) ;
      if ( GXutil.startsWith( AV9serverPart, "/") )
      {
         AV9serverPart = GXutil.format( "http://localhost:80%1", GXutil.trim( AV9serverPart), "", "", "", "", "", "", "", "") ;
      }
      AV12RegularExpression = "(\\{(\\w+?)\\})" ;
      AV14RegExMatchCollection = GxRegex.Matches(AV9serverPart,AV12RegularExpression) ;
      AV18GXV1 = 1 ;
      while ( AV18GXV1 <= AV14RegExMatchCollection.size() )
      {
         AV15RegExMatch = (GxRegexMatch)((GxRegexMatch)AV14RegExMatchCollection.elementAt(-1+AV18GXV1));
         AV13VarServerValue = AV11varServerParams.get(AV15RegExMatch.getGroups().item(2)) ;
         AV9serverPart = GXutil.strReplace( AV9serverPart, AV15RegExMatch.getValue(), AV13VarServerValue) ;
         AV18GXV1 = (int)(AV18GXV1+1) ;
      }
      AV10serverTemplated = AV9serverPart ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV10serverTemplated, AV19Pgmname) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = processserver.this.AV10serverTemplated;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10serverTemplated = "" ;
      AV9serverPart = "" ;
      AV12RegularExpression = "" ;
      AV14RegExMatchCollection = new com.genexus.GxUnknownObjectCollection();
      AV15RegExMatch = new GxRegexMatch();
      AV13VarServerValue = "" ;
      AV19Pgmname = "" ;
      AV19Pgmname = "PonteWay.v1.OpenAPICommon.ProcessServer" ;
      /* GeneXus formulas. */
      AV19Pgmname = "PonteWay.v1.OpenAPICommon.ProcessServer" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV18GXV1 ;
   private String AV12RegularExpression ;
   private String AV13VarServerValue ;
   private String AV19Pgmname ;
   private String AV8server ;
   private String AV10serverTemplated ;
   private String AV9serverPart ;
   private String[] aP2 ;
   private com.genexus.util.GXProperties AV11varServerParams ;
   private GxRegexMatch AV15RegExMatch ;
   private com.genexus.GxUnknownObjectCollection AV14RegExMatchCollection ;
}

