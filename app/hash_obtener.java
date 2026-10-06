package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hash_obtener extends GXProcedure
{
   public hash_obtener( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hash_obtener.class ), "" );
   }

   public hash_obtener( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String[] aP1 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      hash_obtener.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                             boolean[] aP3 )
   {
      hash_obtener.this.AV12Data = aP0;
      hash_obtener.this.aP1 = aP1;
      hash_obtener.this.aP2 = aP2;
      hash_obtener.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13Path ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.getpathapp(remoteHandle, context).execute( "java", GXv_char2) ;
      hash_obtener.this.GXt_char1 = GXv_char2[0] ;
      AV13Path = GXt_char1 ;
      AV13Path = GXutil.trim( AV13Path) + httpContext.getMessage( "\\at\\PrivateKey", "") ;
      AV10File.setSource( AV13Path );
      AV15Ok = true ;
      if ( AV10File.exists() )
      {
         AV10File.close();
         AV9Hash = AV8AppTool.hashat(AV13Path, AV12Data) ;
         if ( (GXutil.strcmp("", AV9Hash)==0) )
         {
            AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "DTM_HASH_02", "") );
            AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Hash no creado, verifique el archivo PrivateKey", "") );
            AV16Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV14Messages.add(AV16Message, 0);
            AV15Ok = false ;
         }
         if ( GXutil.strcmp(AV9Hash, httpContext.getMessage( "Erro ao validar o arquivo PEM: unable to convert key pair: class configured for KeyFactory (provider: BC) cannot be found.", "")) == 0 )
         {
            AV9Hash = "" ;
            AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "DTM_HASH_03", "") );
            AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Hash no creado, verifique el archivo PrivateKey", "") );
            AV16Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV14Messages.add(AV16Message, 0);
            AV15Ok = false ;
         }
      }
      else
      {
         AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "DTM_HASH_01", "") );
         AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "No existe el archivo PrivateKey en carpeta AT", "") );
         AV16Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV14Messages.add(AV16Message, 0);
         AV15Ok = false ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = hash_obtener.this.AV9Hash;
      this.aP2[0] = hash_obtener.this.AV14Messages;
      this.aP3[0] = hash_obtener.this.AV15Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Hash = "" ;
      AV14Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV13Path = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV10File = new com.genexus.util.GXFile();
      AV8AppTool = new app.SdtAppTool(remoteHandle, context);
      AV16Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean AV15Ok ;
   private String AV12Data ;
   private String AV9Hash ;
   private String AV13Path ;
   private com.genexus.util.GXFile AV10File ;
   private app.SdtAppTool AV8AppTool ;
   private boolean[] aP3 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV14Messages ;
   private com.genexus.SdtMessages_Message AV16Message ;
}

