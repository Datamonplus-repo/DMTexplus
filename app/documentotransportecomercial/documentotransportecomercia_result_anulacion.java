package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercia_result_anulacion extends GXProcedure
{
   public documentotransportecomercia_result_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercia_result_anulacion.class ), "" );
   }

   public documentotransportecomercia_result_anulacion( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              long aP2 ,
                              String aP3 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      documentotransportecomercia_result_anulacion.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        String aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             String aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                             boolean[] aP5 )
   {
      documentotransportecomercia_result_anulacion.this.AV30EmprCod = aP0;
      documentotransportecomercia_result_anulacion.this.AV33Fichero = aP1;
      documentotransportecomercia_result_anulacion.this.AV20Alb = aP2;
      documentotransportecomercia_result_anulacion.this.AV39ALbProPri = aP3;
      documentotransportecomercia_result_anulacion.this.aP4 = aP4;
      documentotransportecomercia_result_anulacion.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV21station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransportecomercia_result_anulacion.this.GXt_char1 = GXv_char2[0] ;
      AV21station = GXt_char1 ;
      GXv_char2[0] = AV30EmprCod ;
      GXv_char3[0] = AV23emprnom ;
      GXv_char4[0] = AV22usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransportecomercia_result_anulacion.this.AV30EmprCod = GXv_char2[0] ;
      documentotransportecomercia_result_anulacion.this.AV23emprnom = GXv_char3[0] ;
      documentotransportecomercia_result_anulacion.this.AV22usurcod = GXv_char4[0] ;
      GXt_char1 = AV32Dir ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      documentotransportecomercia_result_anulacion.this.GXt_char1 = GXv_char4[0] ;
      AV32Dir = GXt_char1 ;
      AV35Ok = true ;
      AV24inc_obs = "" ;
      AV14ErrM = (byte)(0) ;
      AV17OkAT = (byte)(0) ;
      AV24inc_obs = "" ;
      AV34messages.clear();
      AV29FileR = GXutil.trim( AV32Dir) ;
      if ( GXutil.strcmp(AV39ALbProPri, "1") == 0 )
      {
         GXv_char4[0] = AV41contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV30EmprCod, "100011", GXv_char4) ;
         documentotransportecomercia_result_anulacion.this.AV41contidsernew = GXv_char4[0] ;
         AV42SerieAT = ((GXutil.strcmp("", AV41contidsernew)==0) ? "GR3" : AV41contidsernew) ;
      }
      else
      {
         GXv_char4[0] = AV41contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV30EmprCod, "100012", GXv_char4) ;
         documentotransportecomercia_result_anulacion.this.AV41contidsernew = GXv_char4[0] ;
         AV42SerieAT = ((GXutil.strcmp("", AV41contidsernew)==0) ? "GT4" : AV41contidsernew) ;
      }
      AV29FileR += "\\" + GXutil.trim( AV42SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20Alb, 8, 0)), (short)(8), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
      AV16Path1 = AV29FileR ;
      AV31File.setSource( AV29FileR );
      AV37ExisteFile = AV31File.exists() ;
      if ( AV31File.exists() )
      {
         AV8readfile.open(AV16Path1);
         if ( AV8readfile.getErrCode() > 0 )
         {
            AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV8readfile.getErrCode(), 10, 2)) );
            AV36Message.setgxTv_SdtMessages_Message_Description( AV8readfile.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
            AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV34messages.add(AV36Message, 0);
            AV35Ok = false ;
            AV24inc_obs = Gx_msg ;
         }
         else
         {
            AV19Verr = 0 ;
            AV13ErrorMsg = "" ;
            AV14ErrM = (byte)(0) ;
            AV8readfile.readType((short)(1), httpContext.getMessage( "SOAP-ENV:Fault", ""));
            AV18success = AV8readfile.readType((short)(1), httpContext.getMessage( "faultcode", "")) ;
            if ( AV18success == 0 )
            {
            }
            else
            {
               AV8readfile.close();
               AV8readfile.open(AV16Path1);
               AV8readfile.readType((short)(1), httpContext.getMessage( "SOAP-ENV:Fault", ""));
               AV8readfile.read();
               while ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "SOAP-ENV:Fault", "")) != 0 )
               {
                  if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "faultcode", "")) == 0 )
                  {
                     AV9DocumentNumber = AV8readfile.getValue() ;
                     AV19Verr = (int)(GXutil.lval( GXutil.substring( AV9DocumentNumber, 1, 6))) ;
                     AV14ErrM = (byte)(1) ;
                  }
                  if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "faultstring", "")) == 0 )
                  {
                     AV13ErrorMsg = AV8readfile.getValue() ;
                     AV14ErrM = (byte)(1) ;
                  }
                  AV8readfile.read();
               }
               if ( AV14ErrM == 1 )
               {
                  AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                  AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 10, 0))+GXutil.newLine( ) );
                  AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "faultcode=", "")+GXutil.trim( GXutil.str( AV19Verr, 6, 0))+" "+httpContext.getMessage( "faultstring=", "")+AV13ErrorMsg );
                  AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV34messages.add(AV36Message, 0);
                  AV24inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
                  AV24inc_obs += httpContext.getMessage( "faultcode=", "") + GXutil.str( AV19Verr, 6, 0) + " " + httpContext.getMessage( "faultstring=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
               }
               AV8readfile.close();
            }
            if ( AV14ErrM == 1 )
            {
               new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
               AV14ErrM = (byte)(1) ;
               AV35Ok = false ;
            }
            else
            {
               AV17OkAT = (byte)(0) ;
               AV14ErrM = (byte)(0) ;
               AV12ATDocCodeID = "" ;
               AV11LeoGuia = (byte)(0) ;
               AV8readfile.open(AV16Path1);
               if ( AV8readfile.getErrCode() > 0 )
               {
                  AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV8readfile.getErrCode(), 10, 2)) );
                  AV36Message.setgxTv_SdtMessages_Message_Description( AV8readfile.getErrDescription()+httpContext.getMessage( " 2ª lectura.Error Open Fichero XML", "") );
                  AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV34messages.add(AV36Message, 0);
                  AV35Ok = false ;
               }
               else
               {
                  AV8readfile.readType((short)(1), httpContext.getMessage( "S:Body", ""));
                  AV18success = AV8readfile.readType((short)(1), httpContext.getMessage( "ReturnMessage", "")) ;
                  if ( AV18success == 0 )
                  {
                     AV8readfile.close();
                     AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                     AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "&success= ", "")+GXutil.trim( GXutil.str( AV18success, 4, 0)) );
                     AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Anulada la solicitud: No se puede crear un canal seguro SSL/TLS.??", "")+httpContext.getMessage( ", Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 10, 0)) );
                     AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                     AV34messages.add(AV36Message, 0);
                     AV35Ok = false ;
                  }
                  else
                  {
                     AV8readfile.close();
                     AV8readfile.open(AV16Path1);
                     AV8readfile.readType((short)(1), httpContext.getMessage( "S:Body", ""));
                     AV8readfile.read();
                     while ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "S:Body", "")) != 0 )
                     {
                        if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "ReturnCode", "")) == 0 )
                        {
                           AV9DocumentNumber = AV8readfile.getValue() ;
                           AV19Verr = (int)(GXutil.lval( GXutil.substring( AV9DocumentNumber, 1, 6))) ;
                           if ( AV19Verr == 0 )
                           {
                              AV17OkAT = (byte)(1) ;
                           }
                           else
                           {
                              AV14ErrM = (byte)(1) ;
                           }
                           AV24inc_obs = httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV19Verr, 6, 0) + GXutil.newLine( ) ;
                           AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "ReturnCode", "") );
                           AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "ReturnCode= ", "")+GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                           AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV34messages.add(AV36Message, 0);
                        }
                        if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "ReturnMessage", "")) == 0 )
                        {
                           AV13ErrorMsg = AV8readfile.getValue() ;
                           if ( GXutil.strcmp(AV13ErrorMsg, httpContext.getMessage( "OK", "")) == 0 )
                           {
                              AV17OkAT = (byte)(1) ;
                              AV14ErrM = (byte)(0) ;
                           }
                           else
                           {
                              AV14ErrM = (byte)(1) ;
                           }
                           AV24inc_obs += httpContext.getMessage( "ReturnMessage=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
                           AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "ReturnMessage", "") );
                           AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "ReturnMessage= ", "")+AV13ErrorMsg );
                           AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV34messages.add(AV36Message, 0);
                        }
                        if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "DocumentNumber", "")) == 0 )
                        {
                           AV9DocumentNumber = AV8readfile.getValue() ;
                           AV11LeoGuia = (byte)(1) ;
                           AV24inc_obs += httpContext.getMessage( "Confirmacion AT. DocumentNumber= ", "") + GXutil.trim( AV9DocumentNumber) + " " + GXutil.newLine( ) ;
                           AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "DocumentNumber", "") );
                           AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "DocumentNumber= ", "")+GXutil.trim( AV9DocumentNumber) );
                           AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV34messages.add(AV36Message, 0);
                        }
                        if ( ( AV17OkAT == 1 ) && ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "ATDocCodeID", "")) == 0 ) )
                        {
                           AV12ATDocCodeID = AV8readfile.getValue() ;
                           /* Execute user subroutine: 'CALCOM' */
                           S111 ();
                           if ( returnInSub )
                           {
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           AV35Ok = true ;
                           AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                           AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "ATDocCodeID= ", "")+AV12ATDocCodeID+GXutil.newLine( ) );
                           AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "O documento Nº= ", "")+GXutil.str( AV20Alb, 8, 0)+GXutil.newLine( ) );
                           AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "foi atualizado com o código AT= ", "")+GXutil.trim( AV12ATDocCodeID) );
                           AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV34messages.add(AV36Message, 0);
                           AV11LeoGuia = (byte)(0) ;
                           AV24inc_obs += httpContext.getMessage( "ATDocCodeID= ", "") + AV12ATDocCodeID + GXutil.newLine( ) ;
                           AV24inc_obs += httpContext.getMessage( "O documento Nº= ", "") + GXutil.str( AV20Alb, 8, 0) + GXutil.newLine( ) ;
                           AV24inc_obs += httpContext.getMessage( "foi atualizado com o código AT= ", "") + GXutil.trim( AV12ATDocCodeID) ;
                           new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
                        }
                        AV8readfile.read();
                     }
                     AV8readfile.close();
                     if ( AV14ErrM == 1 )
                     {
                        AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 10, 0))+GXutil.newLine( ) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+AV24inc_obs );
                        AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                        AV34messages.add(AV36Message, 0);
                        AV24inc_obs += httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
                        AV35Ok = false ;
                     }
                     if ( (0==AV17OkAT) && (0==AV14ErrM) )
                     {
                        AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "2ª Lectura. No encontrado TAG: <ReturnCode>,<ReturnMessage>,<DocumentNumber>", "") );
                        AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Anulada la solicitud: No se puede crear un canal seguro SSL/TLS.??", "")+httpContext.getMessage( ", Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 10, 0)) );
                        AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                        AV34messages.add(AV36Message, 0);
                        AV35Ok = false ;
                     }
                     if ( AV40ActualizadoCalprd == 1 )
                     {
                        AV35Ok = true ;
                     }
                  }
               }
            }
         }
      }
      else
      {
         AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "Error.NO existe el fichero", "") );
         AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "&Dir= ", "")+GXutil.trim( AV32Dir)+httpContext.getMessage( " &FileR= ", "")+AV29FileR+httpContext.getMessage( " &Path1= ", "")+AV16Path1 );
         AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV34messages.add(AV36Message, 0);
         AV24inc_obs = httpContext.getMessage( "&File.Exists()=False", "") + GXutil.trim( AV16Path1) ;
         AV35Ok = false ;
         System.out.println( httpContext.getMessage( "&inc_obs=", "")+AV24inc_obs );
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CALCOM' Routine */
      returnInSub = false ;
      AV24inc_obs = "" ;
      AV24inc_obs = httpContext.getMessage( "CALCOM.O documento Nº= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "DocumentNumber=", "") + GXutil.trim( AV9DocumentNumber) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "ANULADO", "") + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      AV40ActualizadoCalprd = (short)(0) ;
      /* Using cursor P0AKA2 */
      pr_default.execute(0, new Object[] {AV30EmprCod, Long.valueOf(AV20Alb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P0AKA2_A14AlbComCod[0] ;
         A396EmprCod = P0AKA2_A396EmprCod[0] ;
         A10738AlbComSt = P0AKA2_A10738AlbComSt[0] ;
         A10738AlbComSt = "A" ;
         AV40ActualizadoCalprd = (short)(1) ;
         /* Using cursor P0AKA3 */
         pr_default.execute(1, new Object[] {A10738AlbComSt, A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV40ActualizadoCalprd == 1 )
      {
         if ( GXutil.strcmp(AV24inc_obs, " ") != 0 )
         {
            new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = documentotransportecomercia_result_anulacion.this.AV34messages;
      this.aP5[0] = documentotransportecomercia_result_anulacion.this.AV35Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercia_result_anulacion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV21station = "" ;
      GXv_char2 = new String[1] ;
      AV23emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV22usurcod = "" ;
      AV32Dir = "" ;
      GXt_char1 = "" ;
      AV24inc_obs = "" ;
      AV29FileR = "" ;
      AV41contidsernew = "" ;
      AV42SerieAT = "" ;
      GXv_char4 = new String[1] ;
      AV16Path1 = "" ;
      AV31File = new com.genexus.util.GXFile();
      AV8readfile = new com.genexus.xml.XMLReader();
      AV36Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      Gx_msg = "" ;
      AV13ErrorMsg = "" ;
      AV9DocumentNumber = "" ;
      AV46Pgmname = "" ;
      AV12ATDocCodeID = "" ;
      A396EmprCod = "" ;
      scmdbuf = "" ;
      P0AKA2_A14AlbComCod = new int[1] ;
      P0AKA2_A396EmprCod = new String[] {""} ;
      P0AKA2_A10738AlbComSt = new String[] {""} ;
      A10738AlbComSt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercia_result_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AKA2_A14AlbComCod, P0AKA2_A396EmprCod, P0AKA2_A10738AlbComSt
            }
            , new Object[] {
            }
         }
      );
      AV46Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercia_Result_ANULACION" ;
      /* GeneXus formulas. */
      AV46Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercia_Result_ANULACION" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14ErrM ;
   private byte AV17OkAT ;
   private byte AV11LeoGuia ;
   private short AV18success ;
   private short AV40ActualizadoCalprd ;
   private short Gx_err ;
   private int AV19Verr ;
   private int A14AlbComCod ;
   private long AV20Alb ;
   private String AV30EmprCod ;
   private String AV33Fichero ;
   private String AV39ALbProPri ;
   private String AV21station ;
   private String GXv_char2[] ;
   private String AV23emprnom ;
   private String GXv_char3[] ;
   private String AV22usurcod ;
   private String GXt_char1 ;
   private String AV29FileR ;
   private String AV41contidsernew ;
   private String AV42SerieAT ;
   private String GXv_char4[] ;
   private String AV16Path1 ;
   private String Gx_msg ;
   private String AV13ErrorMsg ;
   private String AV9DocumentNumber ;
   private String AV46Pgmname ;
   private String AV12ATDocCodeID ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A10738AlbComSt ;
   private boolean AV35Ok ;
   private boolean AV37ExisteFile ;
   private boolean returnInSub ;
   private String AV32Dir ;
   private String AV24inc_obs ;
   private com.genexus.util.GXFile AV31File ;
   private boolean[] aP5 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AKA2_A14AlbComCod ;
   private String[] P0AKA2_A396EmprCod ;
   private String[] P0AKA2_A10738AlbComSt ;
   private com.genexus.xml.XMLReader AV8readfile ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV34messages ;
   private com.genexus.SdtMessages_Message AV36Message ;
}

final  class documentotransportecomercia_result_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKA2", "SELECT AlbComCod, EmprCod, AlbComSt FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AKA3", "UPDATE TXPCALCOM SET AlbComSt=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

