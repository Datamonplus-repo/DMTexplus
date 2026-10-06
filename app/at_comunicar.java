package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class at_comunicar extends GXProcedure
{
   public at_comunicar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( at_comunicar.class ), "" );
   }

   public at_comunicar( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              String aP2 ,
                              String aP3 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      at_comunicar.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                             boolean[] aP5 )
   {
      at_comunicar.this.AV14EmprCod = aP0;
      at_comunicar.this.AV16Fichero = aP1;
      at_comunicar.this.AV25UserAT = aP2;
      at_comunicar.this.AV21PassAT = aP3;
      at_comunicar.this.aP4 = aP4;
      at_comunicar.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV23Path_ApiSender ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.getpathapp(remoteHandle, context).execute( "java", GXv_char2) ;
      at_comunicar.this.GXt_char1 = GXv_char2[0] ;
      AV23Path_ApiSender = GXt_char1 + "\\at" ;
      GXt_char1 = AV12Dir ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char2) ;
      at_comunicar.this.GXt_char1 = GXv_char2[0] ;
      AV12Dir = GXt_char1 ;
      GXt_char1 = AV35clavepublica ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "CPAT00", ""), GXv_char2) ;
      at_comunicar.this.GXt_char1 = GXv_char2[0] ;
      AV35clavepublica = GXt_char1 ;
      GXt_char1 = AV28Vurl ;
      GXv_char2[0] = AV14EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "URL", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      at_comunicar.this.AV14EmprCod = GXv_char2[0] ;
      at_comunicar.this.GXt_char1 = GXv_char4[0] ;
      AV28Vurl = GXt_char1 ;
      GXt_char1 = AV27Vpfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "PFX", ""), GXv_char4) ;
      at_comunicar.this.GXt_char1 = GXv_char4[0] ;
      AV27Vpfx = GXt_char1 ;
      GXt_char1 = AV26Vpasspfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char4) ;
      at_comunicar.this.GXt_char1 = GXv_char4[0] ;
      AV26Vpasspfx = GXt_char1 ;
      GXt_char1 = AV32Vurlt ;
      GXv_char4[0] = AV14EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "URLT", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      at_comunicar.this.AV14EmprCod = GXv_char4[0] ;
      at_comunicar.this.GXt_char1 = GXv_char2[0] ;
      AV32Vurlt = GXt_char1 ;
      GXt_char1 = AV33Vpfxtest ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "PFXTES", ""), GXv_char4) ;
      at_comunicar.this.GXt_char1 = GXv_char4[0] ;
      AV33Vpfxtest = GXt_char1 ;
      GXt_char1 = AV34Vpwdpfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "PWDPFX", ""), GXv_char4) ;
      at_comunicar.this.GXt_char1 = GXv_char4[0] ;
      AV34Vpwdpfx = GXt_char1 ;
      AV11Comm = "\"" + GXutil.trim( AV23Path_ApiSender) + "\\" ;
      AV11Comm += httpContext.getMessage( "apisender2.exe\" -", "") ;
      if ( ! (GXutil.strcmp("", AV32Vurlt)==0) )
      {
         AV11Comm += GXutil.trim( AV32Vurlt) + " " ;
      }
      else
      {
         AV11Comm += GXutil.trim( AV28Vurl) + " " ;
      }
      AV11Comm += httpContext.getMessage( "-p ", "") + GXutil.trim( AV12Dir) + " " ;
      AV11Comm += httpContext.getMessage( "-cat ", "") + GXutil.trim( AV35clavepublica) + " " ;
      if ( ! (GXutil.strcmp("", AV32Vurlt)==0) )
      {
         AV11Comm += httpContext.getMessage( "-c ", "") + GXutil.trim( AV33Vpfxtest) + " " ;
         AV11Comm += httpContext.getMessage( "-cpass ", "") + GXutil.trim( AV34Vpwdpfx) + " " ;
      }
      else
      {
         AV11Comm += httpContext.getMessage( "-c ", "") + GXutil.trim( AV27Vpfx) + " " ;
         AV11Comm += httpContext.getMessage( "-cpass ", "") + GXutil.trim( AV26Vpasspfx) + " " ;
      }
      AV11Comm += httpContext.getMessage( "-user ", "") + GXutil.trim( AV25UserAT) + " " ;
      AV11Comm += httpContext.getMessage( "-pass ", "") + GXutil.trim( AV21PassAT) + " " ;
      AV11Comm += httpContext.getMessage( "-fi ", "") + GXutil.trim( AV16Fichero) + httpContext.getMessage( ".xml", "") + " " ;
      AV11Comm += httpContext.getMessage( "-fo ", "") + GXutil.trim( AV16Fichero) + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
      AV11Comm += httpContext.getMessage( " -hb ", "") + GXutil.trim( AV16Fichero) + httpContext.getMessage( "_hb", "") + httpContext.getMessage( ".xml", "") ;
      AV30Retorno = (short)(GXutil.shell( AV11Comm, 1, 0)) ;
      AV17File.setSource( GXutil.trim( AV12Dir)+"\\"+GXutil.trim( AV16Fichero)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
      AV37Name_file = AV17File.getAbsoluteName() ;
      if ( AV17File.exists() )
      {
         AV29OK = true ;
         AV19Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV19Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "AT_00", "") );
         AV19Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Comm=", "")+AV11Comm );
         AV19Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV20Messages.add(AV19Message, 0);
      }
      else
      {
         AV29OK = false ;
         AV19Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV19Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "AT_01", "") );
         AV19Message.setgxTv_SdtMessages_Message_Description( AV37Name_file+httpContext.getMessage( " no ha sido creado correctamente", "") );
         AV19Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV20Messages.add(AV19Message, 0);
         AV19Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV19Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "AT_02", "") );
         AV19Message.setgxTv_SdtMessages_Message_Description( AV11Comm );
         AV19Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
         AV20Messages.add(AV19Message, 0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = at_comunicar.this.AV20Messages;
      this.aP5[0] = at_comunicar.this.AV29OK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV23Path_ApiSender = "" ;
      AV12Dir = "" ;
      AV35clavepublica = "" ;
      AV28Vurl = "" ;
      AV27Vpfx = "" ;
      AV26Vpasspfx = "" ;
      AV32Vurlt = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV33Vpfxtest = "" ;
      AV34Vpwdpfx = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV11Comm = "" ;
      AV17File = new com.genexus.util.GXFile();
      AV37Name_file = "" ;
      AV19Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV30Retorno ;
   private short Gx_err ;
   private String AV14EmprCod ;
   private String AV16Fichero ;
   private String AV25UserAT ;
   private String AV21PassAT ;
   private String AV35clavepublica ;
   private String AV28Vurl ;
   private String AV27Vpfx ;
   private String AV26Vpasspfx ;
   private String AV32Vurlt ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV33Vpfxtest ;
   private String AV34Vpwdpfx ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV11Comm ;
   private boolean AV29OK ;
   private String AV23Path_ApiSender ;
   private String AV12Dir ;
   private String AV37Name_file ;
   private com.genexus.util.GXFile AV17File ;
   private boolean[] aP5 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV20Messages ;
   private com.genexus.SdtMessages_Message AV19Message ;
}

