package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_result_anulacion extends GXProcedure
{
   public documentotransporteproveedor_result_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_result_anulacion.class ), "" );
   }

   public documentotransporteproveedor_result_anulacion( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String[] aP0 ,
                              String[] aP1 ,
                              int[] aP2 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      documentotransporteproveedor_result_anulacion.this.aP4 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ,
                        boolean[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ,
                             boolean[] aP4 )
   {
      documentotransporteproveedor_result_anulacion.this.AV30EmprCod = aP0[0];
      this.aP0 = aP0;
      documentotransporteproveedor_result_anulacion.this.AV33Fichero = aP1[0];
      this.aP1 = aP1;
      documentotransporteproveedor_result_anulacion.this.AV20Alb = aP2[0];
      this.aP2 = aP2;
      documentotransporteproveedor_result_anulacion.this.AV34messages = aP3[0];
      this.aP3 = aP3;
      documentotransporteproveedor_result_anulacion.this.AV35Ok = aP4[0];
      this.aP4 = aP4;
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
      documentotransporteproveedor_result_anulacion.this.GXt_char1 = GXv_char2[0] ;
      AV21station = GXt_char1 ;
      GXv_char2[0] = AV30EmprCod ;
      GXv_char3[0] = AV23emprnom ;
      GXv_char4[0] = AV22usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransporteproveedor_result_anulacion.this.AV30EmprCod = GXv_char2[0] ;
      documentotransporteproveedor_result_anulacion.this.AV23emprnom = GXv_char3[0] ;
      documentotransporteproveedor_result_anulacion.this.AV22usurcod = GXv_char4[0] ;
      GXt_char1 = AV32Dir ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      documentotransporteproveedor_result_anulacion.this.GXt_char1 = GXv_char4[0] ;
      AV32Dir = GXt_char1 ;
      AV35Ok = true ;
      AV24inc_obs = "" ;
      AV14ErrM = (byte)(0) ;
      AV17OkAT = (byte)(0) ;
      AV24inc_obs = "" ;
      AV29FileR = GXutil.trim( AV32Dir) ;
      GXv_char4[0] = AV39contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "REMTRA", ""), GXv_char4) ;
      documentotransporteproveedor_result_anulacion.this.AV39contidsernew = GXv_char4[0] ;
      AV40SerieAT = ((GXutil.strcmp("", AV39contidsernew)==0) ? "GD5" : AV39contidsernew) ;
      AV29FileR += "\\" + GXutil.trim( AV40SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20Alb, 8, 0)), (short)(8), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
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
                  AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0))+GXutil.newLine( ) );
                  AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "faultcode=", "")+GXutil.trim( GXutil.str( AV19Verr, 6, 0))+" "+httpContext.getMessage( "faultstring=", "")+AV13ErrorMsg );
                  AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV34messages.add(AV36Message, 0);
                  AV24inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
                  AV24inc_obs += httpContext.getMessage( "faultcode=", "") + GXutil.str( AV19Verr, 6, 0) + " " + httpContext.getMessage( "faultstring=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
               }
               AV8readfile.close();
            }
            if ( AV14ErrM == 1 )
            {
               new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
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
                     AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Anulada la solicitud: No se puede crear un canal seguro SSL/TLS.??", "")+httpContext.getMessage( ", Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0)) );
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
                           /* Execute user subroutine: 'CALPRO' */
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
                           AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "foi ANULADO ", "")+GXutil.trim( AV12ATDocCodeID) );
                           AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV34messages.add(AV36Message, 0);
                           AV11LeoGuia = (byte)(0) ;
                           AV24inc_obs += httpContext.getMessage( "ATDocCodeID= ", "") + AV12ATDocCodeID + GXutil.newLine( ) ;
                           AV24inc_obs += httpContext.getMessage( "O documento Nº= ", "") + GXutil.str( AV20Alb, 8, 0) + GXutil.newLine( ) ;
                           AV24inc_obs += httpContext.getMessage( "foi ANULADO ", "") + GXutil.trim( AV12ATDocCodeID) ;
                           new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
                        }
                        AV8readfile.read();
                     }
                     AV8readfile.close();
                     if ( AV14ErrM == 1 )
                     {
                        AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0))+GXutil.newLine( ) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+AV24inc_obs );
                        AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                        AV34messages.add(AV36Message, 0);
                        AV24inc_obs += httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
                        AV35Ok = false ;
                     }
                     if ( (0==AV17OkAT) && (0==AV14ErrM) )
                     {
                        AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "2ª Lectura. No encontrado TAG: <ReturnCode>,<ReturnMessage>,<DocumentNumber>", "") );
                        AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Anulada la solicitud: No se puede crear un canal seguro SSL/TLS.??", "")+httpContext.getMessage( ", Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0)) );
                        AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                        AV34messages.add(AV36Message, 0);
                        AV35Ok = false ;
                     }
                     if ( AV41ActualizadoCalprd == 1 )
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CALPRO' Routine */
      returnInSub = false ;
      AV24inc_obs = "" ;
      AV24inc_obs = httpContext.getMessage( "Devgen.O documento Nº= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "DocumentNumber=", "") + GXutil.trim( AV9DocumentNumber) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "ANULADO", "") + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      /* Using cursor P0AK62 */
      pr_default.execute(0, new Object[] {AV30EmprCod, Integer.valueOf(AV20Alb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13419AlbProPrvI = P0AK62_A13419AlbProPrvI[0] ;
         A13418AlbProID = P0AK62_A13418AlbProID[0] ;
         A396EmprCod = P0AK62_A396EmprCod[0] ;
         A13440AlbProAnul = P0AK62_A13440AlbProAnul[0] ;
         A13430AlbProDate = P0AK62_A13430AlbProDate[0] ;
         A13440AlbProAnul = "A" ;
         AV42AlbProDate = A13430AlbProDate ;
         AV41ActualizadoCalprd = (short)(1) ;
         /* Using cursor P0AK63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P0AK63_A719PrdNum[0] ;
            A13442AlbProLine = P0AK63_A13442AlbProLine[0] ;
            if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = "DLT" ;
               GXv_char2[0] = A719PrdNum ;
               GXv_int5[0] = A13418AlbProID ;
               GXv_date6[0] = AV42AlbProDate ;
               GXv_char7[0] = "P" ;
               GXv_int8[0] = A13442AlbProLine ;
               GXv_int9[0] = A13419AlbProPrvI ;
               GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
               GXv_char12[0] = AV22usurcod ;
               GXv_char13[0] = "" ;
               new app.pdevcalpro(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5, GXv_date6, GXv_char7, GXv_int8, GXv_int9, GXv_decimal10, GXv_decimal11, GXv_char12, GXv_char13) ;
               documentotransporteproveedor_result_anulacion.this.A396EmprCod = GXv_char4[0] ;
               documentotransporteproveedor_result_anulacion.this.A719PrdNum = GXv_char2[0] ;
               documentotransporteproveedor_result_anulacion.this.A13418AlbProID = GXv_int5[0] ;
               documentotransporteproveedor_result_anulacion.this.AV42AlbProDate = GXv_date6[0] ;
               documentotransporteproveedor_result_anulacion.this.A13442AlbProLine = GXv_int8[0] ;
               documentotransporteproveedor_result_anulacion.this.A13419AlbProPrvI = GXv_int9[0] ;
               documentotransporteproveedor_result_anulacion.this.AV22usurcod = GXv_char12[0] ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P0AK64 */
         pr_default.execute(2, new Object[] {A13440AlbProAnul, A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV41ActualizadoCalprd == 1 )
      {
         if ( GXutil.strcmp(AV24inc_obs, " ") != 0 )
         {
            new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = documentotransporteproveedor_result_anulacion.this.AV30EmprCod;
      this.aP1[0] = documentotransporteproveedor_result_anulacion.this.AV33Fichero;
      this.aP2[0] = documentotransporteproveedor_result_anulacion.this.AV20Alb;
      this.aP3[0] = documentotransporteproveedor_result_anulacion.this.AV34messages;
      this.aP4[0] = documentotransporteproveedor_result_anulacion.this.AV35Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_result_anulacion");
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
      AV23emprnom = "" ;
      AV22usurcod = "" ;
      AV32Dir = "" ;
      GXt_char1 = "" ;
      AV24inc_obs = "" ;
      AV29FileR = "" ;
      AV39contidsernew = "" ;
      AV40SerieAT = "" ;
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
      P0AK62_A13419AlbProPrvI = new int[1] ;
      P0AK62_A13418AlbProID = new int[1] ;
      P0AK62_A396EmprCod = new String[] {""} ;
      P0AK62_A13440AlbProAnul = new String[] {""} ;
      P0AK62_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      A13440AlbProAnul = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      AV42AlbProDate = GXutil.nullDate() ;
      P0AK63_A396EmprCod = new String[] {""} ;
      P0AK63_A13418AlbProID = new int[1] ;
      P0AK63_A719PrdNum = new String[] {""} ;
      P0AK63_A13442AlbProLine = new short[1] ;
      A719PrdNum = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_result_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AK62_A13419AlbProPrvI, P0AK62_A13418AlbProID, P0AK62_A396EmprCod, P0AK62_A13440AlbProAnul, P0AK62_A13430AlbProDate
            }
            , new Object[] {
            P0AK63_A396EmprCod, P0AK63_A13418AlbProID, P0AK63_A719PrdNum, P0AK63_A13442AlbProLine
            }
            , new Object[] {
            }
         }
      );
      AV46Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_Result_ANULACION" ;
      /* GeneXus formulas. */
      AV46Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_Result_ANULACION" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14ErrM ;
   private byte AV17OkAT ;
   private byte AV11LeoGuia ;
   private short AV18success ;
   private short AV41ActualizadoCalprd ;
   private short A13442AlbProLine ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV20Alb ;
   private int AV19Verr ;
   private int A13419AlbProPrvI ;
   private int A13418AlbProID ;
   private int GXv_int5[] ;
   private int GXv_int9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String AV30EmprCod ;
   private String AV33Fichero ;
   private String AV21station ;
   private String AV23emprnom ;
   private String AV22usurcod ;
   private String GXt_char1 ;
   private String AV29FileR ;
   private String AV39contidsernew ;
   private String AV40SerieAT ;
   private String AV16Path1 ;
   private String Gx_msg ;
   private String AV13ErrorMsg ;
   private String AV9DocumentNumber ;
   private String AV46Pgmname ;
   private String AV12ATDocCodeID ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13440AlbProAnul ;
   private String A719PrdNum ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV42AlbProDate ;
   private java.util.Date GXv_date6[] ;
   private boolean AV35Ok ;
   private boolean AV37ExisteFile ;
   private boolean returnInSub ;
   private String AV32Dir ;
   private String AV24inc_obs ;
   private com.genexus.util.GXFile AV31File ;
   private boolean[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AK62_A13419AlbProPrvI ;
   private int[] P0AK62_A13418AlbProID ;
   private String[] P0AK62_A396EmprCod ;
   private String[] P0AK62_A13440AlbProAnul ;
   private java.util.Date[] P0AK62_A13430AlbProDate ;
   private String[] P0AK63_A396EmprCod ;
   private int[] P0AK63_A13418AlbProID ;
   private String[] P0AK63_A719PrdNum ;
   private short[] P0AK63_A13442AlbProLine ;
   private com.genexus.xml.XMLReader AV8readfile ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV34messages ;
   private com.genexus.SdtMessages_Message AV36Message ;
}

final  class documentotransporteproveedor_result_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK62", "SELECT AlbProPrvI, AlbProID, EmprCod, AlbProAnul, AlbProDate FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK63", "SELECT EmprCod, AlbProID, PrdNum, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AK64", "UPDATE TXPCALPRO SET AlbProAnul=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

