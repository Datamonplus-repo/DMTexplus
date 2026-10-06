package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_result_anulacion extends GXProcedure
{
   public documentodetransporteproduccion_result_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_result_anulacion.class ), "" );
   }

   public documentodetransporteproduccion_result_anulacion( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String[] aP0 ,
                              String[] aP1 ,
                              long[] aP2 ,
                              String[] aP3 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      documentodetransporteproduccion_result_anulacion.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 ,
                        String[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             String[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                             boolean[] aP5 )
   {
      documentodetransporteproduccion_result_anulacion.this.AV30EmprCod = aP0[0];
      this.aP0 = aP0;
      documentodetransporteproduccion_result_anulacion.this.AV33Fichero = aP1[0];
      this.aP1 = aP1;
      documentodetransporteproduccion_result_anulacion.this.AV20Alb = aP2[0];
      this.aP2 = aP2;
      documentodetransporteproduccion_result_anulacion.this.AV39ALbProPri = aP3[0];
      this.aP3 = aP3;
      documentodetransporteproduccion_result_anulacion.this.AV34messages = aP4[0];
      this.aP4 = aP4;
      documentodetransporteproduccion_result_anulacion.this.AV35Ok = aP5[0];
      this.aP5 = aP5;
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
      documentodetransporteproduccion_result_anulacion.this.GXt_char1 = GXv_char2[0] ;
      AV21station = GXt_char1 ;
      GXv_char2[0] = AV30EmprCod ;
      GXv_char3[0] = AV23emprnom ;
      GXv_char4[0] = AV22usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_result_anulacion.this.AV30EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_result_anulacion.this.AV23emprnom = GXv_char3[0] ;
      documentodetransporteproduccion_result_anulacion.this.AV22usurcod = GXv_char4[0] ;
      GXt_char1 = AV32Dir ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      documentodetransporteproduccion_result_anulacion.this.GXt_char1 = GXv_char4[0] ;
      AV32Dir = GXt_char1 ;
      AV35Ok = true ;
      AV24inc_obs = "" ;
      AV14ErrM = (byte)(0) ;
      AV17OkAT = (byte)(0) ;
      AV24inc_obs = "" ;
      AV29FileR = GXutil.trim( AV32Dir) ;
      if ( GXutil.strcmp(AV39ALbProPri, "1") == 0 )
      {
         GXv_char4[0] = AV41contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV30EmprCod, "666666", GXv_char4) ;
         documentodetransporteproduccion_result_anulacion.this.AV41contidsernew = GXv_char4[0] ;
         AV42SerieAT = ((GXutil.strcmp("", AV41contidsernew)==0) ? "GR1" : AV41contidsernew) ;
         AV29FileR += "\\" + GXutil.trim( AV42SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20Alb, 10, 0)), (short)(10), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
      }
      else
      {
         GXv_char4[0] = AV41contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV30EmprCod, "555555", GXv_char4) ;
         documentodetransporteproduccion_result_anulacion.this.AV41contidsernew = GXv_char4[0] ;
         AV42SerieAT = ((GXutil.strcmp("", AV41contidsernew)==0) ? "GT2" : AV41contidsernew) ;
         AV29FileR += "\\" + GXutil.trim( AV42SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20Alb, 10, 0)), (short)(10), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
      }
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
               new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV57Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
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
                           /* Execute user subroutine: 'CALPRD' */
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
                           new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV57Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
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
                        new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV57Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
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
      /* 'CALPRD' Routine */
      returnInSub = false ;
      AV24inc_obs = "" ;
      AV24inc_obs = httpContext.getMessage( "Devgen.O documento Nº= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "DocumentNumber=", "") + GXutil.trim( AV9DocumentNumber) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "foi atualizado com o código AT= ", "") + AV12ATDocCodeID + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      AV40ActualizadoCalprd = (short)(0) ;
      /* Using cursor P0AJM2 */
      pr_default.execute(0, new Object[] {AV30EmprCod, Long.valueOf(AV20Alb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0AJM2_A30AlbProCod[0] ;
         A396EmprCod = P0AJM2_A396EmprCod[0] ;
         A5140AlbMarca = P0AJM2_A5140AlbMarca[0] ;
         A5140AlbMarca = "A" ;
         AV40ActualizadoCalprd = (short)(1) ;
         /* Using cursor P0AJM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1265BarAlbPie = P0AJM3_A1265BarAlbPie[0] ;
            A1261BarAlbKgmE = P0AJM3_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P0AJM3_A1263BarAlbMtrE[0] ;
            A130BarCodPar = P0AJM3_A130BarCodPar[0] ;
            A132BarCodReo = P0AJM3_A132BarCodReo[0] ;
            A129BarCod = P0AJM3_A129BarCod[0] ;
            AV53BarAlbPie = A1265BarAlbPie ;
            AV51BarAlbKgmE = A1261BarAlbKgmE ;
            AV52BarAlbMtrE = A1263BarAlbMtrE ;
            AV48barcod = A129BarCod ;
            AV49barcodreo = A132BarCodReo ;
            AV50barcodpar = A130BarCodPar ;
            /* Execute user subroutine: 'BARCAD' */
            S123 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P0AJM4 */
         pr_default.execute(2, new Object[] {A5140AlbMarca, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV40ActualizadoCalprd == 1 )
      {
         if ( GXutil.strcmp(AV24inc_obs, " ") != 0 )
         {
            new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV57Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
         }
      }
   }

   public void S123( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P0AJM5 */
      pr_default.execute(3, new Object[] {AV30EmprCod, Integer.valueOf(AV48barcod), Byte.valueOf(AV49barcodreo), AV50barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P0AJM5_A130BarCodPar[0] ;
         A132BarCodReo = P0AJM5_A132BarCodReo[0] ;
         A129BarCod = P0AJM5_A129BarCod[0] ;
         A396EmprCod = P0AJM5_A396EmprCod[0] ;
         A213BarSit = P0AJM5_A213BarSit[0] ;
         A161BarFecSal = P0AJM5_A161BarFecSal[0] ;
         /* Using cursor P0AJM6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A170BarKilLan = P0AJM6_A170BarKilLan[0] ;
            A183BarMetLan = P0AJM6_A183BarMetLan[0] ;
            A1271BarPieLzd = P0AJM6_A1271BarPieLzd[0] ;
            A201BarPieEst = P0AJM6_A201BarPieEst[0] ;
            A200BarPieCod = P0AJM6_A200BarPieCod[0] ;
            A170BarKilLan = A170BarKilLan.subtract(AV51BarAlbKgmE) ;
            if ( A170BarKilLan.doubleValue() < 0 )
            {
               A170BarKilLan = DecimalUtil.doubleToDec(0) ;
            }
            A183BarMetLan = A183BarMetLan.subtract(AV52BarAlbMtrE) ;
            if ( A183BarMetLan.doubleValue() < 0 )
            {
               A183BarMetLan = DecimalUtil.doubleToDec(0) ;
            }
            A1271BarPieLzd = (int)(A1271BarPieLzd-AV53BarAlbPie) ;
            if ( A1271BarPieLzd < 0 )
            {
               A1271BarPieLzd = 0 ;
            }
            AV45Kilos = AV51BarAlbKgmE ;
            AV46Metros = AV52BarAlbMtrE ;
            A201BarPieEst = (byte)(0) ;
            /* Using cursor P0AJM7 */
            pr_default.execute(5, new Object[] {A170BarKilLan, A183BarMetLan, Integer.valueOf(A1271BarPieLzd), Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         A161BarFecSal = GXutil.nullDate() ;
         /* Using cursor P0AJM8 */
         pr_default.execute(6, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = documentodetransporteproduccion_result_anulacion.this.AV30EmprCod;
      this.aP1[0] = documentodetransporteproduccion_result_anulacion.this.AV33Fichero;
      this.aP2[0] = documentodetransporteproduccion_result_anulacion.this.AV20Alb;
      this.aP3[0] = documentodetransporteproduccion_result_anulacion.this.AV39ALbProPri;
      this.aP4[0] = documentodetransporteproduccion_result_anulacion.this.AV34messages;
      this.aP5[0] = documentodetransporteproduccion_result_anulacion.this.AV35Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_result_anulacion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
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
      AV57Pgmname = "" ;
      AV12ATDocCodeID = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0AJM2_A30AlbProCod = new long[1] ;
      P0AJM2_A396EmprCod = new String[] {""} ;
      P0AJM2_A5140AlbMarca = new String[] {""} ;
      A5140AlbMarca = "" ;
      P0AJM3_A396EmprCod = new String[] {""} ;
      P0AJM3_A30AlbProCod = new long[1] ;
      P0AJM3_A1265BarAlbPie = new int[1] ;
      P0AJM3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJM3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJM3_A130BarCodPar = new String[] {""} ;
      P0AJM3_A132BarCodReo = new byte[1] ;
      P0AJM3_A129BarCod = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV51BarAlbKgmE = DecimalUtil.ZERO ;
      AV52BarAlbMtrE = DecimalUtil.ZERO ;
      AV50barcodpar = "" ;
      P0AJM5_A130BarCodPar = new String[] {""} ;
      P0AJM5_A132BarCodReo = new byte[1] ;
      P0AJM5_A129BarCod = new int[1] ;
      P0AJM5_A396EmprCod = new String[] {""} ;
      P0AJM5_A213BarSit = new byte[1] ;
      P0AJM5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJM6_A396EmprCod = new String[] {""} ;
      P0AJM6_A129BarCod = new int[1] ;
      P0AJM6_A132BarCodReo = new byte[1] ;
      P0AJM6_A130BarCodPar = new String[] {""} ;
      P0AJM6_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJM6_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJM6_A1271BarPieLzd = new int[1] ;
      P0AJM6_A201BarPieEst = new byte[1] ;
      P0AJM6_A200BarPieCod = new String[] {""} ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV45Kilos = DecimalUtil.ZERO ;
      AV46Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_result_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AJM2_A30AlbProCod, P0AJM2_A396EmprCod, P0AJM2_A5140AlbMarca
            }
            , new Object[] {
            P0AJM3_A396EmprCod, P0AJM3_A30AlbProCod, P0AJM3_A1265BarAlbPie, P0AJM3_A1261BarAlbKgmE, P0AJM3_A1263BarAlbMtrE, P0AJM3_A130BarCodPar, P0AJM3_A132BarCodReo, P0AJM3_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0AJM5_A130BarCodPar, P0AJM5_A132BarCodReo, P0AJM5_A129BarCod, P0AJM5_A396EmprCod, P0AJM5_A213BarSit, P0AJM5_A161BarFecSal
            }
            , new Object[] {
            P0AJM6_A396EmprCod, P0AJM6_A129BarCod, P0AJM6_A132BarCodReo, P0AJM6_A130BarCodPar, P0AJM6_A170BarKilLan, P0AJM6_A183BarMetLan, P0AJM6_A1271BarPieLzd, P0AJM6_A201BarPieEst, P0AJM6_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV57Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_Result_ANULACION" ;
      /* GeneXus formulas. */
      AV57Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_Result_ANULACION" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14ErrM ;
   private byte AV17OkAT ;
   private byte AV11LeoGuia ;
   private byte A132BarCodReo ;
   private byte AV49barcodreo ;
   private byte A213BarSit ;
   private byte A201BarPieEst ;
   private short AV18success ;
   private short AV40ActualizadoCalprd ;
   private short Gx_err ;
   private int AV19Verr ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int AV53BarAlbPie ;
   private int AV48barcod ;
   private int A1271BarPieLzd ;
   private long AV20Alb ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV51BarAlbKgmE ;
   private java.math.BigDecimal AV52BarAlbMtrE ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal AV45Kilos ;
   private java.math.BigDecimal AV46Metros ;
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
   private String AV57Pgmname ;
   private String AV12ATDocCodeID ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5140AlbMarca ;
   private String A130BarCodPar ;
   private String AV50barcodpar ;
   private String A200BarPieCod ;
   private java.util.Date A161BarFecSal ;
   private boolean AV35Ok ;
   private boolean AV37ExisteFile ;
   private boolean returnInSub ;
   private String AV32Dir ;
   private String AV24inc_obs ;
   private com.genexus.util.GXFile AV31File ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P0AJM2_A30AlbProCod ;
   private String[] P0AJM2_A396EmprCod ;
   private String[] P0AJM2_A5140AlbMarca ;
   private String[] P0AJM3_A396EmprCod ;
   private long[] P0AJM3_A30AlbProCod ;
   private int[] P0AJM3_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AJM3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AJM3_A1263BarAlbMtrE ;
   private String[] P0AJM3_A130BarCodPar ;
   private byte[] P0AJM3_A132BarCodReo ;
   private int[] P0AJM3_A129BarCod ;
   private String[] P0AJM5_A130BarCodPar ;
   private byte[] P0AJM5_A132BarCodReo ;
   private int[] P0AJM5_A129BarCod ;
   private String[] P0AJM5_A396EmprCod ;
   private byte[] P0AJM5_A213BarSit ;
   private java.util.Date[] P0AJM5_A161BarFecSal ;
   private String[] P0AJM6_A396EmprCod ;
   private int[] P0AJM6_A129BarCod ;
   private byte[] P0AJM6_A132BarCodReo ;
   private String[] P0AJM6_A130BarCodPar ;
   private java.math.BigDecimal[] P0AJM6_A170BarKilLan ;
   private java.math.BigDecimal[] P0AJM6_A183BarMetLan ;
   private int[] P0AJM6_A1271BarPieLzd ;
   private byte[] P0AJM6_A201BarPieEst ;
   private String[] P0AJM6_A200BarPieCod ;
   private com.genexus.xml.XMLReader AV8readfile ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV34messages ;
   private com.genexus.SdtMessages_Message AV36Message ;
}

final  class documentodetransporteproduccion_result_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJM2", "SELECT AlbProCod, EmprCod, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJM3", "SELECT EmprCod, AlbProCod, BarAlbPie, BarAlbKgmE, BarAlbMtrE, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AJM4", "UPDATE TXPCALPRD SET AlbMarca=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P0AJM5", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJM6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarKilLan, BarMetLan, BarPieLzd, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AJM7", "UPDATE TXPBARPIE SET BarKilLan=?, BarMetLan=?, BarPieLzd=?, BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P0AJM8", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

