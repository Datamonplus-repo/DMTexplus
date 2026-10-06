package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_result extends GXProcedure
{
   public trabajoexterno_result( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_result.class ), "" );
   }

   public trabajoexterno_result( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String[] aP0 ,
                              String[] aP1 ,
                              long[] aP2 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      trabajoexterno_result.this.aP4 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ,
                        boolean[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ,
                             boolean[] aP4 )
   {
      trabajoexterno_result.this.AV30EmprCod = aP0[0];
      this.aP0 = aP0;
      trabajoexterno_result.this.AV33Fichero = aP1[0];
      this.aP1 = aP1;
      trabajoexterno_result.this.AV20Alb = aP2[0];
      this.aP2 = aP2;
      trabajoexterno_result.this.AV34messages = aP3[0];
      this.aP3 = aP3;
      trabajoexterno_result.this.AV35Ok = aP4[0];
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
      trabajoexterno_result.this.GXt_char1 = GXv_char2[0] ;
      AV21station = GXt_char1 ;
      GXv_char2[0] = AV30EmprCod ;
      GXv_char3[0] = AV23emprnom ;
      GXv_char4[0] = AV22usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_result.this.AV30EmprCod = GXv_char2[0] ;
      trabajoexterno_result.this.AV23emprnom = GXv_char3[0] ;
      trabajoexterno_result.this.AV22usurcod = GXv_char4[0] ;
      GXt_char1 = AV32Dir ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      trabajoexterno_result.this.GXt_char1 = GXv_char4[0] ;
      AV32Dir = GXt_char1 ;
      AV35Ok = true ;
      AV24inc_obs = "" ;
      AV14ErrM = (byte)(0) ;
      AV17OkAT = (byte)(0) ;
      AV24inc_obs = "" ;
      AV29FileR = GXutil.trim( AV32Dir) ;
      GXv_char4[0] = AV43contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV30EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_char4) ;
      trabajoexterno_result.this.AV43contidsernew = GXv_char4[0] ;
      AV44SerieAT = ((GXutil.strcmp("", AV43contidsernew)==0) ? "GT5" : AV43contidsernew) ;
      AV29FileR += "\\" + GXutil.trim( AV44SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20Alb, 8, 0)), (short)(8), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
      System.out.println( httpContext.getMessage( "&FileR=", "")+AV29FileR );
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
               new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
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
                           if ( ( AV19Verr == 0 ) || ( AV19Verr == -100 ) || ( AV19Verr == -3 ) )
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
                           AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "ReturnMessage", "") );
                           AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "ReturnMessage= ", "")+AV13ErrorMsg );
                           AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV34messages.add(AV36Message, 0);
                        }
                        if ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "DocumentNumber", "")) == 0 )
                        {
                           AV9DocumentNumber = AV8readfile.getValue() ;
                           AV10Albprocod = (int)(GXutil.lval( GXutil.substring( AV9DocumentNumber, 1, 8))) ;
                           AV11LeoGuia = (byte)(1) ;
                           AV24inc_obs += httpContext.getMessage( "Confirmacion AT. DocumentNumber= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + " " + GXutil.newLine( ) ;
                           AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                           AV36Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "DocumentNumber", "") );
                           AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "DocumentNumber= ", "")+GXutil.trim( AV9DocumentNumber) );
                           AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                           AV34messages.add(AV36Message, 0);
                        }
                        if ( ( AV17OkAT == 1 ) && ( GXutil.strcmp(AV8readfile.getName(), httpContext.getMessage( "ATDocCodeID", "")) == 0 ) )
                        {
                           AV12ATDocCodeID = AV8readfile.getValue() ;
                           /* Execute user subroutine: 'CEXTSA' */
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
                           new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
                        }
                        AV8readfile.read();
                     }
                     AV8readfile.close();
                     if ( ( AV17OkAT == 1 ) && ( AV19Verr == -100 ) )
                     {
                        AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 10, 0))+GXutil.newLine( ) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "")+GXutil.newLine( ) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+httpContext.getMessage( "ReturnCode=", "")+GXutil.str( AV19Verr, 6, 0)+" "+httpContext.getMessage( "ReturnMessage=", "")+AV13ErrorMsg+GXutil.newLine( ) );
                        AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
                        AV34messages.add(AV36Message, 0);
                        AV24inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "") + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV19Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
                        /* Execute user subroutine: 'CEXTSA2' */
                        S121 ();
                        if ( returnInSub )
                        {
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        AV35Ok = false ;
                     }
                     if ( ( AV17OkAT == 1 ) && ( AV19Verr == -3 ) )
                     {
                        AV24inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "Erro=-3. O sistema não devolve o código AT", "") + GXutil.newLine( ) ;
                        AV24inc_obs += httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV19Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV13ErrorMsg + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
                        /* Execute user subroutine: 'CEXTSA2' */
                        S121 ();
                        if ( returnInSub )
                        {
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        AV35Ok = false ;
                     }
                     if ( AV14ErrM == 1 )
                     {
                        AV36Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                        AV36Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV19Verr, 6, 0)) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Incidencia AT, Documento= ", "")+GXutil.trim( GXutil.str( AV20Alb, 10, 0))+GXutil.newLine( ) );
                        AV36Message.setgxTv_SdtMessages_Message_Description( AV36Message.getgxTv_SdtMessages_Message_Description()+AV24inc_obs );
                        AV36Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                        AV34messages.add(AV36Message, 0);
                        AV24inc_obs += httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
                        new app.pctrinc(remoteHandle, context).execute( AV30EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
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
         System.out.println( AV24inc_obs );
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CEXTSA' Routine */
      returnInSub = false ;
      AV24inc_obs = "" ;
      AV24inc_obs = httpContext.getMessage( "Devgen.O documento Nº= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "DocumentNumber=", "") + GXutil.trim( AV9DocumentNumber) + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "foi atualizado com o código AT= ", "") + AV12ATDocCodeID + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
      AV24inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
      AV40ActualizadoCalprd = (short)(0) ;
      /* Using cursor P0ABW2 */
      pr_default.execute(0, new Object[] {AV30EmprCod, Long.valueOf(AV20Alb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2253SalExtAlb = P0ABW2_A2253SalExtAlb[0] ;
         A396EmprCod = P0ABW2_A396EmprCod[0] ;
         A10741SalEnvAT = P0ABW2_A10741SalEnvAT[0] ;
         A10742SalCodeID = P0ABW2_A10742SalCodeID[0] ;
         A10080SalSts = P0ABW2_A10080SalSts[0] ;
         A10767SalExtAT = P0ABW2_A10767SalExtAT[0] ;
         A10741SalEnvAT = (byte)(3) ;
         A10742SalCodeID = AV12ATDocCodeID ;
         A10080SalSts = "F" ;
         A10767SalExtAT = httpContext.getMessage( "A", "") ;
         AV40ActualizadoCalprd = (short)(1) ;
         /* Using cursor P0ABW3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A10741SalEnvAT), A10742SalCodeID, A10080SalSts, A10767SalExtAT, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV40ActualizadoCalprd == 1 )
      {
         if ( GXutil.strcmp(AV24inc_obs, " ") != 0 )
         {
            new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
         }
      }
   }

   public void S121( )
   {
      /* 'CEXTSA2' Routine */
      returnInSub = false ;
      AV24inc_obs = "" ;
      /* Using cursor P0ABW4 */
      pr_default.execute(2, new Object[] {AV30EmprCod, Long.valueOf(AV20Alb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2253SalExtAlb = P0ABW4_A2253SalExtAlb[0] ;
         A396EmprCod = P0ABW4_A396EmprCod[0] ;
         A10741SalEnvAT = P0ABW4_A10741SalEnvAT[0] ;
         A10742SalCodeID = P0ABW4_A10742SalCodeID[0] ;
         A10767SalExtAT = P0ABW4_A10767SalExtAT[0] ;
         A10080SalSts = P0ABW4_A10080SalSts[0] ;
         A10741SalEnvAT = (byte)(3) ;
         A10742SalCodeID = " " ;
         A10767SalExtAT = httpContext.getMessage( "A", "") ;
         A10080SalSts = "F" ;
         AV24inc_obs = httpContext.getMessage( "Devgen.O documento Nº= ", "") + GXutil.trim( GXutil.str( AV20Alb, 10, 0)) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "DocumentNumber=", "") + GXutil.trim( AV9DocumentNumber) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Statusr=", "") + GXutil.trim( GXutil.str( AV19Verr, 6, 0)) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "A", "") + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "foi atualizado sem com o código AT", "") + GXutil.newLine( ) ;
         /* Using cursor P0ABW5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A10741SalEnvAT), A10742SalCodeID, A10767SalExtAT, A10080SalSts, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV24inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV48Pgmname, AV22usurcod, AV21station, AV24inc_obs, (int)(AV20Alb), (byte)(0), "") ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = trabajoexterno_result.this.AV30EmprCod;
      this.aP1[0] = trabajoexterno_result.this.AV33Fichero;
      this.aP2[0] = trabajoexterno_result.this.AV20Alb;
      this.aP3[0] = trabajoexterno_result.this.AV34messages;
      this.aP4[0] = trabajoexterno_result.this.AV35Ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_result");
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
      AV43contidsernew = "" ;
      GXv_char4 = new String[1] ;
      AV44SerieAT = "" ;
      AV16Path1 = "" ;
      AV31File = new com.genexus.util.GXFile();
      AV8readfile = new com.genexus.xml.XMLReader();
      AV36Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      Gx_msg = "" ;
      AV13ErrorMsg = "" ;
      AV9DocumentNumber = "" ;
      AV48Pgmname = "" ;
      AV12ATDocCodeID = "" ;
      A396EmprCod = "" ;
      scmdbuf = "" ;
      P0ABW2_A2253SalExtAlb = new int[1] ;
      P0ABW2_A396EmprCod = new String[] {""} ;
      P0ABW2_A10741SalEnvAT = new byte[1] ;
      P0ABW2_A10742SalCodeID = new String[] {""} ;
      P0ABW2_A10080SalSts = new String[] {""} ;
      P0ABW2_A10767SalExtAT = new String[] {""} ;
      A10742SalCodeID = "" ;
      A10080SalSts = "" ;
      A10767SalExtAT = "" ;
      P0ABW4_A2253SalExtAlb = new int[1] ;
      P0ABW4_A396EmprCod = new String[] {""} ;
      P0ABW4_A10741SalEnvAT = new byte[1] ;
      P0ABW4_A10742SalCodeID = new String[] {""} ;
      P0ABW4_A10767SalExtAT = new String[] {""} ;
      P0ABW4_A10080SalSts = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_result__default(),
         new Object[] {
             new Object[] {
            P0ABW2_A2253SalExtAlb, P0ABW2_A396EmprCod, P0ABW2_A10741SalEnvAT, P0ABW2_A10742SalCodeID, P0ABW2_A10080SalSts, P0ABW2_A10767SalExtAT
            }
            , new Object[] {
            }
            , new Object[] {
            P0ABW4_A2253SalExtAlb, P0ABW4_A396EmprCod, P0ABW4_A10741SalEnvAT, P0ABW4_A10742SalCodeID, P0ABW4_A10767SalExtAT, P0ABW4_A10080SalSts
            }
            , new Object[] {
            }
         }
      );
      AV48Pgmname = "TrabajosExternos.TrabajoExterno_Result" ;
      /* GeneXus formulas. */
      AV48Pgmname = "TrabajosExternos.TrabajoExterno_Result" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14ErrM ;
   private byte AV17OkAT ;
   private byte AV11LeoGuia ;
   private byte A10741SalEnvAT ;
   private short AV18success ;
   private short AV40ActualizadoCalprd ;
   private short Gx_err ;
   private int AV19Verr ;
   private int AV10Albprocod ;
   private int A2253SalExtAlb ;
   private long AV20Alb ;
   private String AV30EmprCod ;
   private String AV33Fichero ;
   private String AV21station ;
   private String GXv_char2[] ;
   private String AV23emprnom ;
   private String GXv_char3[] ;
   private String AV22usurcod ;
   private String GXt_char1 ;
   private String AV29FileR ;
   private String AV43contidsernew ;
   private String GXv_char4[] ;
   private String AV44SerieAT ;
   private String AV16Path1 ;
   private String Gx_msg ;
   private String AV13ErrorMsg ;
   private String AV9DocumentNumber ;
   private String AV48Pgmname ;
   private String AV12ATDocCodeID ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A10742SalCodeID ;
   private String A10080SalSts ;
   private String A10767SalExtAT ;
   private boolean AV35Ok ;
   private boolean AV37ExisteFile ;
   private boolean returnInSub ;
   private String AV32Dir ;
   private String AV24inc_obs ;
   private com.genexus.util.GXFile AV31File ;
   private boolean[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P0ABW2_A2253SalExtAlb ;
   private String[] P0ABW2_A396EmprCod ;
   private byte[] P0ABW2_A10741SalEnvAT ;
   private String[] P0ABW2_A10742SalCodeID ;
   private String[] P0ABW2_A10080SalSts ;
   private String[] P0ABW2_A10767SalExtAT ;
   private int[] P0ABW4_A2253SalExtAlb ;
   private String[] P0ABW4_A396EmprCod ;
   private byte[] P0ABW4_A10741SalEnvAT ;
   private String[] P0ABW4_A10742SalCodeID ;
   private String[] P0ABW4_A10767SalExtAT ;
   private String[] P0ABW4_A10080SalSts ;
   private com.genexus.xml.XMLReader AV8readfile ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV34messages ;
   private com.genexus.SdtMessages_Message AV36Message ;
}

final  class trabajoexterno_result__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABW2", "SELECT SalExtAlb, EmprCod, SalEnvAT, SalCodeID, SalSts, SalExtAT FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0ABW3", "UPDATE TXPCEXTSA SET SalEnvAT=?, SalCodeID=?, SalSts=?, SalExtAT=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new ForEachCursor("P0ABW4", "SELECT SalExtAlb, EmprCod, SalEnvAT, SalCodeID, SalExtAT, SalSts FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0ABW5", "UPDATE TXPCEXTSA SET SalEnvAT=?, SalCodeID=?, SalExtAT=?, SalSts=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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

