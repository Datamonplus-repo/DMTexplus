package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_result extends GXProcedure
{
   public documentotransporteproveedor_result( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_result.class ), "" );
   }

   public documentotransporteproveedor_result( int remoteHandle ,
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
      documentotransporteproveedor_result.this.aP4 = new boolean[] {false};
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
      documentotransporteproveedor_result.this.AV32EmprCod = aP0[0];
      this.aP0 = aP0;
      documentotransporteproveedor_result.this.AV36Fichero = aP1[0];
      this.aP1 = aP1;
      documentotransporteproveedor_result.this.AV20Alb = aP2[0];
      this.aP2 = aP2;
      documentotransporteproveedor_result.this.AV37messages = aP3[0];
      this.aP3 = aP3;
      documentotransporteproveedor_result.this.AV38Ok = aP4[0];
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
      documentotransporteproveedor_result.this.GXt_char1 = GXv_char2[0] ;
      AV21station = GXt_char1 ;
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV23emprnom ;
      GXv_char4[0] = AV22usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransporteproveedor_result.this.AV32EmprCod = GXv_char2[0] ;
      documentotransporteproveedor_result.this.AV23emprnom = GXv_char3[0] ;
      documentotransporteproveedor_result.this.AV22usurcod = GXv_char4[0] ;
      GXt_char1 = AV35Dir ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV32EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      documentotransporteproveedor_result.this.GXt_char1 = GXv_char4[0] ;
      AV35Dir = GXt_char1 ;
      AV38Ok = true ;
      AV24inc_obs = "" ;
      AV14ErrM = (byte)(0) ;
      AV17OkAT = (byte)(0) ;
      AV24inc_obs = "" ;
      AV31FileR = GXutil.trim( AV35Dir) ;
      GXv_char4[0] = AV43contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV32EmprCod, httpContext.getMessage( "REMTRA", ""), GXv_char4) ;
      documentotransporteproveedor_result.this.AV43contidsernew = GXv_char4[0] ;
      AV42SerieAT = ((GXutil.strcmp("", AV43contidsernew)==0) ? "GD5" : AV43contidsernew) ;
      AV31FileR += "\\" + GXutil.trim( AV42SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20Alb, 8, 0)), (short)(8), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
      AV16Path1 = AV31FileR ;
      AV34File.setSource( AV31FileR );
      AV40ExisteFile = AV34File.exists() ;
      if ( AV34File.exists() )
      {
         AV8readfile.open(AV16Path1);
         if ( AV8readfile.getErrCode() > 0 )
         {
            AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV39Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV8readfile.getErrCode(), 10, 2)) );
            AV39Message.setgxTv_SdtMessages_Message_Description( AV8readfile.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
            AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV37messages.add(AV39Message, 0);
            AV38Ok = false ;
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
                  AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV39Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                  AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0))+GXutil.newLine( ) );
                  AV39Message.setgxTv_SdtMessages_Message_Description( AV39Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "faultcode=", "")+GXutil.trim( GXutil.str( AV19Verr, 6, 0))+" "+httpContext.getMessage( "faultstring=", "")+AV13ErrorMsg );
                  AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV37messages.add(AV39Message, 0);
                  AV24inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
                  AV24inc_obs += httpContext.getMessage( "faultcode=", "") + GXutil.str( AV19Verr, 6, 0) + " " + httpContext.getMessage( "faultstring=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
               }
               AV8readfile.close();
            }
            if ( AV14ErrM == 1 )
            {
               new app.pctrinc(remoteHandle, context).execute( AV32EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
               AV14ErrM = (byte)(1) ;
               AV38Ok = false ;
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
                  AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV39Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV8readfile.getErrCode(), 10, 2)) );
                  AV39Message.setgxTv_SdtMessages_Message_Description( AV8readfile.getErrDescription()+httpContext.getMessage( " 2ª lectura.Error Open Fichero XML", "") );
                  AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV37messages.add(AV39Message, 0);
                  AV38Ok = false ;
               }
               else
               {
                  AV8readfile.readType((short)(1), httpContext.getMessage( "S:Body", ""));
                  AV18success = AV8readfile.readType((short)(1), httpContext.getMessage( "ReturnMessage", "")) ;
                  if ( AV18success == 0 )
                  {
                     AV8readfile.close();
                     AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                     AV39Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "&success= ", "")+GXutil.trim( GXutil.str( AV18success, 4, 0)) );
                     AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Anulada la solicitud: No se puede crear un canal seguro SSL/TLS.??", "")+httpContext.getMessage( ", Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0)) );
                     AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                     AV37messages.add(AV39Message, 0);
                     AV38Ok = false ;
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
                           if ( ( AV19Verr == 0 ) || ( AV19Verr == -100 ) || ( AV19Verr == -3 ) )
                           {
                              AV17OkAT = (byte)(1) ;
                           }
                           else
                           {
                              AV14ErrM = (byte)(1) ;
                           }
                           AV24inc_obs = httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV19Verr, 6, 0) + GXutil.newLine( ) ;
                           AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV39Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "ReturnCode", "") );
                           AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "ReturnCode= ", "")+GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                           AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV37messages.add(AV39Message, 0);
                        }
                        if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "ReturnMessage", "")) == 0 )
                        {
                           AV13ErrorMsg = AV8readfile.getValue() ;
                           if ( ( GXutil.strcmp(AV13ErrorMsg, httpContext.getMessage( "OK", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( AV13ErrorMsg, 1, 6), httpContext.getMessage( "Alerta", "")) == 0 ) || ( ( AV19Verr == -100 ) ) || ( ( AV19Verr == -3 ) ) )
                           {
                              AV17OkAT = (byte)(1) ;
                              AV14ErrM = (byte)(0) ;
                           }
                           else
                           {
                              AV14ErrM = (byte)(1) ;
                           }
                           AV24inc_obs += httpContext.getMessage( "ReturnMessage=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
                           AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV39Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "ReturnMessage", "") );
                           AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "ReturnMessage= ", "")+AV13ErrorMsg );
                           AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV37messages.add(AV39Message, 0);
                        }
                        if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "DocumentNumber", "")) == 0 )
                        {
                           AV9DocumentNumber = AV8readfile.getValue() ;
                           AV10Albprocod = (int)(GXutil.lval( GXutil.substring( AV9DocumentNumber, 1, 8))) ;
                           AV11LeoGuia = (byte)(1) ;
                           AV24inc_obs += httpContext.getMessage( "Confirmacion AT. DocumentNumber= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + " " + GXutil.newLine( ) ;
                           AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV39Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "DocumentNumber", "") );
                           AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "DocumentNumber= ", "")+GXutil.trim( AV9DocumentNumber) );
                           AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV37messages.add(AV39Message, 0);
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
                           AV38Ok = true ;
                           AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV39Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                           AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "ATDocCodeID= ", "")+AV12ATDocCodeID+GXutil.newLine( ) );
                           AV39Message.setgxTv_SdtMessages_Message_Description( AV39Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "O documento Nº= ", "")+GXutil.str( AV20Alb, 8, 0)+GXutil.newLine( ) );
                           AV39Message.setgxTv_SdtMessages_Message_Description( AV39Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "foi atualizado com o código AT= ", "")+GXutil.trim( AV12ATDocCodeID) );
                           AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV37messages.add(AV39Message, 0);
                           AV11LeoGuia = (byte)(0) ;
                           AV24inc_obs += httpContext.getMessage( "ATDocCodeID= ", "") + AV12ATDocCodeID + GXutil.newLine( ) ;
                           AV24inc_obs += httpContext.getMessage( "O documento Nº= ", "") + GXutil.str( AV20Alb, 8, 0) + GXutil.newLine( ) ;
                           AV24inc_obs += httpContext.getMessage( "foi atualizado com o código AT= ", "") + GXutil.trim( AV12ATDocCodeID) ;
                           new app.pctrinc(remoteHandle, context).execute( AV32EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
                        }
                        AV8readfile.read();
                     }
                     AV8readfile.close();
                     if ( ( AV17OkAT == 1 ) && ( AV19Verr == -100 ) )
                     {
                        AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV39Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                        AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0))+GXutil.newLine( ) );
                        AV39Message.setgxTv_SdtMessages_Message_Description( AV39Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "")+GXutil.newLine( ) );
                        AV39Message.setgxTv_SdtMessages_Message_Description( AV39Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "ReturnCode=", "")+GXutil.str( AV19Verr, 6, 0)+" "+httpContext.getMessage( "ReturnMessage=", "")+AV13ErrorMsg+GXutil.newLine( ) );
                        AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                        AV37messages.add(AV39Message, 0);
                        AV24inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "") + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV19Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV32EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
                        /* Execute user subroutine: 'CALPRO2' */
                        S121 ();
                        if ( returnInSub )
                        {
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        AV38Ok = false ;
                     }
                     if ( ( AV17OkAT == 1 ) && ( AV19Verr == -3 ) )
                     {
                        AV24inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "Erro=-3. O sistema não devolve o código AT", "") + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV19Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV32EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
                        /* Execute user subroutine: 'CALPRO2' */
                        S121 ();
                        if ( returnInSub )
                        {
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        AV38Ok = false ;
                     }
                     if ( AV14ErrM == 1 )
                     {
                        AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV39Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                        AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0))+GXutil.newLine( ) );
                        AV39Message.setgxTv_SdtMessages_Message_Description( AV39Message.getgxTv_SdtMessages_Message_Description()+AV24inc_obs );
                        AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                        AV37messages.add(AV39Message, 0);
                        AV24inc_obs += httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV32EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
                        AV38Ok = false ;
                     }
                     if ( (0==AV17OkAT) && (0==AV14ErrM) )
                     {
                        AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV39Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "2ª Lectura. No encontrado TAG: <ReturnCode>,<ReturnMessage>,<DocumentNumber>", "") );
                        AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Anulada la solicitud: No se puede crear un canal seguro SSL/TLS.??", "")+httpContext.getMessage( ", Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 8, 0)) );
                        AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                        AV37messages.add(AV39Message, 0);
                        AV38Ok = false ;
                     }
                     if ( AV41ActualizadoCalpro == 1 )
                     {
                        AV38Ok = true ;
                     }
                  }
               }
            }
         }
      }
      else
      {
         AV39Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV39Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "Error.NO existe el fichero", "") );
         AV39Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "&Dir= ", "")+GXutil.trim( AV35Dir)+httpContext.getMessage( " &FileR= ", "")+AV31FileR+httpContext.getMessage( " &Path1= ", "")+AV16Path1 );
         AV39Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV37messages.add(AV39Message, 0);
         AV24inc_obs = httpContext.getMessage( "&File.Exists()=False", "") + GXutil.trim( AV16Path1) ;
         AV38Ok = false ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CALPRO' Routine */
      returnInSub = false ;
      AV24inc_obs = "" ;
      AV24inc_obs = httpContext.getMessage( "CALPRO.O documento Nº= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "DocumentNumber=", "") + GXutil.trim( AV9DocumentNumber) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "foi atualizado com o código AT= ", "") + AV12ATDocCodeID + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
      AV41ActualizadoCalpro = (short)(0) ;
      /* Using cursor P09U52 */
      pr_default.execute(0, new Object[] {AV32EmprCod, Integer.valueOf(AV20Alb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13418AlbProID = P09U52_A13418AlbProID[0] ;
         A396EmprCod = P09U52_A396EmprCod[0] ;
         A13438AlbProStAT = P09U52_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P09U52_A13436AlbProIDAT[0] ;
         A13435AlbProEnvA = P09U52_A13435AlbProEnvA[0] ;
         A13440AlbProAnul = P09U52_A13440AlbProAnul[0] ;
         A13438AlbProStAT = (byte)(3) ;
         A13436AlbProIDAT = AV12ATDocCodeID ;
         A13435AlbProEnvA = httpContext.getMessage( "A", "") ;
         A13440AlbProAnul = "F" ;
         AV41ActualizadoCalpro = (short)(1) ;
         /* Using cursor P09U53 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A13438AlbProStAT), A13436AlbProIDAT, A13435AlbProEnvA, A13440AlbProAnul, A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV41ActualizadoCalpro == 1 )
      {
         if ( GXutil.strcmp(AV24inc_obs, " ") != 0 )
         {
            new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
         }
      }
   }

   public void S121( )
   {
      /* 'CALPRO2' Routine */
      returnInSub = false ;
      AV24inc_obs = "" ;
      /* Using cursor P09U54 */
      pr_default.execute(2, new Object[] {AV32EmprCod, Integer.valueOf(AV20Alb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13418AlbProID = P09U54_A13418AlbProID[0] ;
         A396EmprCod = P09U54_A396EmprCod[0] ;
         A13438AlbProStAT = P09U54_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P09U54_A13436AlbProIDAT[0] ;
         A13435AlbProEnvA = P09U54_A13435AlbProEnvA[0] ;
         A13440AlbProAnul = P09U54_A13440AlbProAnul[0] ;
         A13438AlbProStAT = (byte)(3) ;
         A13436AlbProIDAT = " " ;
         A13435AlbProEnvA = httpContext.getMessage( "A", "") ;
         A13440AlbProAnul = "F" ;
         AV24inc_obs = httpContext.getMessage( "CALPRO.O documento Nº= ", "") + GXutil.trim( GXutil.str( AV20Alb, 8, 0)) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "DocumentNumber=", "") + GXutil.trim( AV9DocumentNumber) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Statusr=", "") + GXutil.trim( GXutil.str( AV19Verr, 6, 0)) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "foi atualizado sem com o código AT", "") + GXutil.newLine( ) ;
         /* Using cursor P09U55 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A13438AlbProStAT), A13436AlbProIDAT, A13435AlbProEnvA, A13440AlbProAnul, A396EmprCod, Integer.valueOf(A13418AlbProID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV24inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, AV20Alb, (byte)(0), "") ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = documentotransporteproveedor_result.this.AV32EmprCod;
      this.aP1[0] = documentotransporteproveedor_result.this.AV36Fichero;
      this.aP2[0] = documentotransporteproveedor_result.this.AV20Alb;
      this.aP3[0] = documentotransporteproveedor_result.this.AV37messages;
      this.aP4[0] = documentotransporteproveedor_result.this.AV38Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_result");
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
      AV35Dir = "" ;
      GXt_char1 = "" ;
      AV24inc_obs = "" ;
      AV31FileR = "" ;
      AV43contidsernew = "" ;
      GXv_char4 = new String[1] ;
      AV42SerieAT = "" ;
      AV16Path1 = "" ;
      AV34File = new com.genexus.util.GXFile();
      AV8readfile = new com.genexus.xml.XMLReader();
      AV39Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      Gx_msg = "" ;
      AV13ErrorMsg = "" ;
      AV9DocumentNumber = "" ;
      AV48Pgmname = "" ;
      AV12ATDocCodeID = "" ;
      A396EmprCod = "" ;
      scmdbuf = "" ;
      P09U52_A13418AlbProID = new int[1] ;
      P09U52_A396EmprCod = new String[] {""} ;
      P09U52_A13438AlbProStAT = new byte[1] ;
      P09U52_A13436AlbProIDAT = new String[] {""} ;
      P09U52_A13435AlbProEnvA = new String[] {""} ;
      P09U52_A13440AlbProAnul = new String[] {""} ;
      A13436AlbProIDAT = "" ;
      A13435AlbProEnvA = "" ;
      A13440AlbProAnul = "" ;
      P09U54_A13418AlbProID = new int[1] ;
      P09U54_A396EmprCod = new String[] {""} ;
      P09U54_A13438AlbProStAT = new byte[1] ;
      P09U54_A13436AlbProIDAT = new String[] {""} ;
      P09U54_A13435AlbProEnvA = new String[] {""} ;
      P09U54_A13440AlbProAnul = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_result__default(),
         new Object[] {
             new Object[] {
            P09U52_A13418AlbProID, P09U52_A396EmprCod, P09U52_A13438AlbProStAT, P09U52_A13436AlbProIDAT, P09U52_A13435AlbProEnvA, P09U52_A13440AlbProAnul
            }
            , new Object[] {
            }
            , new Object[] {
            P09U54_A13418AlbProID, P09U54_A396EmprCod, P09U54_A13438AlbProStAT, P09U54_A13436AlbProIDAT, P09U54_A13435AlbProEnvA, P09U54_A13440AlbProAnul
            }
            , new Object[] {
            }
         }
      );
      AV48Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_Result" ;
      /* GeneXus formulas. */
      AV48Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_Result" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14ErrM ;
   private byte AV17OkAT ;
   private byte AV11LeoGuia ;
   private byte A13438AlbProStAT ;
   private short AV18success ;
   private short AV41ActualizadoCalpro ;
   private short Gx_err ;
   private int AV20Alb ;
   private int AV19Verr ;
   private int AV10Albprocod ;
   private int A13418AlbProID ;
   private String AV32EmprCod ;
   private String AV36Fichero ;
   private String AV21station ;
   private String GXv_char2[] ;
   private String AV23emprnom ;
   private String GXv_char3[] ;
   private String AV22usurcod ;
   private String GXt_char1 ;
   private String AV31FileR ;
   private String AV43contidsernew ;
   private String GXv_char4[] ;
   private String AV42SerieAT ;
   private String AV16Path1 ;
   private String Gx_msg ;
   private String AV13ErrorMsg ;
   private String AV9DocumentNumber ;
   private String AV48Pgmname ;
   private String AV12ATDocCodeID ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13436AlbProIDAT ;
   private String A13435AlbProEnvA ;
   private String A13440AlbProAnul ;
   private boolean AV38Ok ;
   private boolean AV40ExisteFile ;
   private boolean returnInSub ;
   private String AV35Dir ;
   private String AV24inc_obs ;
   private com.genexus.util.GXFile AV34File ;
   private boolean[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P09U52_A13418AlbProID ;
   private String[] P09U52_A396EmprCod ;
   private byte[] P09U52_A13438AlbProStAT ;
   private String[] P09U52_A13436AlbProIDAT ;
   private String[] P09U52_A13435AlbProEnvA ;
   private String[] P09U52_A13440AlbProAnul ;
   private int[] P09U54_A13418AlbProID ;
   private String[] P09U54_A396EmprCod ;
   private byte[] P09U54_A13438AlbProStAT ;
   private String[] P09U54_A13436AlbProIDAT ;
   private String[] P09U54_A13435AlbProEnvA ;
   private String[] P09U54_A13440AlbProAnul ;
   private com.genexus.xml.XMLReader AV8readfile ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV37messages ;
   private com.genexus.SdtMessages_Message AV39Message ;
}

final  class documentotransporteproveedor_result__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09U52", "SELECT AlbProID, EmprCod, AlbProStAT, AlbProIDAT, AlbProEnvA, AlbProAnul FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09U53", "UPDATE TXPCALPRO SET AlbProStAT=?, AlbProIDAT=?, AlbProEnvA=?, AlbProAnul=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
         ,new ForEachCursor("P09U54", "SELECT AlbProID, EmprCod, AlbProStAT, AlbProIDAT, AlbProEnvA, AlbProAnul FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09U55", "UPDATE TXPCALPRO SET AlbProStAT=?, AlbProIDAT=?, AlbProEnvA=?, AlbProAnul=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

