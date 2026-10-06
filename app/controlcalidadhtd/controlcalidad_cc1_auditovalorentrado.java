package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc1_auditovalorentrado extends GXProcedure
{
   public controlcalidad_cc1_auditovalorentrado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc1_auditovalorentrado.class ), "" );
   }

   public controlcalidad_cc1_auditovalorentrado( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             short aP7 ,
                             String aP8 ,
                             String[] aP9 ,
                             byte[] aP10 )
   {
      controlcalidad_cc1_auditovalorentrado.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int aP6 ,
                        short aP7 ,
                        String aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             short aP7 ,
                             String aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 )
   {
      controlcalidad_cc1_auditovalorentrado.this.AV16EmprCod = aP0;
      controlcalidad_cc1_auditovalorentrado.this.AV17BarCod = aP1;
      controlcalidad_cc1_auditovalorentrado.this.AV18BarCodReo = aP2;
      controlcalidad_cc1_auditovalorentrado.this.AV19BarCodPar = aP3;
      controlcalidad_cc1_auditovalorentrado.this.AV20ProCod = aP4;
      controlcalidad_cc1_auditovalorentrado.this.AV21BarOrdLin = aP5;
      controlcalidad_cc1_auditovalorentrado.this.AV22CCTCod = aP6;
      controlcalidad_cc1_auditovalorentrado.this.AV10CCTLin = aP7;
      controlcalidad_cc1_auditovalorentrado.this.AV11CCVal = aP8;
      controlcalidad_cc1_auditovalorentrado.this.aP9 = aP9;
      controlcalidad_cc1_auditovalorentrado.this.aP10 = aP10;
      controlcalidad_cc1_auditovalorentrado.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8mensaje = "" ;
      AV9var_ok = (byte)(1) ;
      AV14Mask = "" ;
      /* Using cursor P0AQ22 */
      pr_default.execute(0, new Object[] {AV16EmprCod, Integer.valueOf(AV17BarCod), AV19BarCodPar, Byte.valueOf(AV18BarCodReo), AV20ProCod, Short.valueOf(AV21BarOrdLin), Integer.valueOf(AV22CCTCod), Short.valueOf(AV10CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AQ22_A396EmprCod[0] ;
         A129BarCod = P0AQ22_A129BarCod[0] ;
         A132BarCodReo = P0AQ22_A132BarCodReo[0] ;
         A130BarCodPar = P0AQ22_A130BarCodPar[0] ;
         A758ProCod = P0AQ22_A758ProCod[0] ;
         A194BarOrdLin = P0AQ22_A194BarOrdLin[0] ;
         A4031CCTCod = P0AQ22_A4031CCTCod[0] ;
         A4034CCTLin = P0AQ22_A4034CCTLin[0] ;
         A4044CCTLinTpoD = P0AQ22_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = P0AQ22_A4045CCTLinLgoD[0] ;
         A4048CCTLinTpoI = P0AQ22_A4048CCTLinTpoI[0] ;
         A4046CCTLinPict = P0AQ22_A4046CCTLinPict[0] ;
         A4044CCTLinTpoD = P0AQ22_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = P0AQ22_A4045CCTLinLgoD[0] ;
         A4048CCTLinTpoI = P0AQ22_A4048CCTLinTpoI[0] ;
         A4046CCTLinPict = P0AQ22_A4046CCTLinPict[0] ;
         if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 )
         {
            AV24valor = GXutil.trim( AV11CCVal) ;
            AV25Length = DecimalUtil.doubleToDec(GXutil.len( AV24valor)) ;
            AV26EsNumerico = true ;
            AV27i = (short)(1) ;
            while ( AV27i <= AV25Length.doubleValue() )
            {
               AV28c = GXutil.substring( AV24valor, AV27i, 1) ;
               if ( ! ( ( GXutil.strcmp(AV28c, "0") == 0 ) || ( GXutil.strcmp(AV28c, "1") == 0 ) || ( GXutil.strcmp(AV28c, "2") == 0 ) || ( GXutil.strcmp(AV28c, "3") == 0 ) || ( GXutil.strcmp(AV28c, "4") == 0 ) || ( GXutil.strcmp(AV28c, "5") == 0 ) || ( GXutil.strcmp(AV28c, "6") == 0 ) || ( GXutil.strcmp(AV28c, "7") == 0 ) || ( GXutil.strcmp(AV28c, "8") == 0 ) || ( GXutil.strcmp(AV28c, "9") == 0 ) || ( GXutil.strcmp(AV28c, ".") == 0 ) ) )
               {
                  AV26EsNumerico = false ;
                  if (true) break;
               }
               AV27i = (short)(AV27i+1) ;
            }
            if ( ! AV26EsNumerico )
            {
               AV8mensaje = httpContext.getMessage( "Debe ingresar un valor numérico.", "") ;
               AV9var_ok = (byte)(0) ;
               if ( AV25Length.doubleValue() > A4045CCTLinLgoD )
               {
                  AV8mensaje = (GXutil.format( httpContext.getMessage( "Máximo %1 caracteres", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0), "", "", "", "", "", "", "", "")) ;
                  AV9var_ok = (byte)(0) ;
               }
               else
               {
                  AV29Puntos = (short)(0) ;
                  AV25Length = DecimalUtil.doubleToDec(GXutil.len( AV11CCVal)) ;
                  AV27i = (short)(1) ;
                  while ( AV27i <= AV25Length.doubleValue() )
                  {
                     if ( GXutil.strcmp(GXutil.substring( AV30CCTVal, AV27i, 1), ".") == 0 )
                     {
                        AV29Puntos = (short)(AV29Puntos+1) ;
                     }
                     AV27i = (short)(AV27i+1) ;
                  }
                  if ( AV29Puntos > 1 )
                  {
                     AV8mensaje = httpContext.getMessage( "Formato numérico inválido", "") ;
                     AV9var_ok = (byte)(0) ;
                  }
               }
            }
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "F", "")) == 0 ) && ( AV9var_ok == 1 ) )
         {
            if ( ! ( GXutil.strcmp(GXutil.trim( localUtil.dtoc( localUtil.ctod( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( AV11CCVal)) == 0 ) )
            {
               AV8mensaje = httpContext.getMessage( "El valor ideal debe ser fecha.", "") ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "H", "")) == 0 )
         {
            if ( ! ( GXutil.strcmp(GXutil.trim( localUtil.ttoc( localUtil.ctot( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), 0, A4045CCTLinLgoD, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), GXutil.trim( AV11CCVal)) == 0 ) && ( AV9var_ok == 1 ) )
            {
               AV8mensaje = httpContext.getMessage( "El valor ideal debe ser hora.", "") ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( AV9var_ok == 1 ) )
         {
            /* Execute user subroutine: 'CCDEF2_1' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'CCDEF2_2' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         GXt_char1 = AV14Mask ;
         GXv_char2[0] = A4046CCTLinPict ;
         GXv_int3[0] = A4045CCTLinLgoD ;
         GXv_char4[0] = GXt_char1 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         controlcalidad_cc1_auditovalorentrado.this.A4046CCTLinPict = GXv_char2[0] ;
         controlcalidad_cc1_auditovalorentrado.this.A4045CCTLinLgoD = (short)((short)(GXv_int3[0])) ;
         controlcalidad_cc1_auditovalorentrado.this.GXt_char1 = GXv_char4[0] ;
         AV14Mask = GXt_char1 ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CCDEF2_1' Routine */
      returnInSub = false ;
      /* Using cursor P0AQ23 */
      pr_default.execute(1, new Object[] {AV16EmprCod, Integer.valueOf(AV22CCTCod), Short.valueOf(AV10CCTLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4049CCTValLin = P0AQ23_A4049CCTValLin[0] ;
         A4034CCTLin = P0AQ23_A4034CCTLin[0] ;
         A4031CCTCod = P0AQ23_A4031CCTCod[0] ;
         A396EmprCod = P0AQ23_A396EmprCod[0] ;
         A4051CCTVal = P0AQ23_A4051CCTVal[0] ;
         A4044CCTLinTpoD = P0AQ23_A4044CCTLinTpoD[0] ;
         A4044CCTLinTpoD = P0AQ23_A4044CCTLinTpoD[0] ;
         if ( ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 ) ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( AV11CCVal, "."), CommonUtil.decimalVal( A4051CCTVal, ".")) < 0 ) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es menor que el mínimo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "F", "")) == 0 ) && GXutil.resetTime(localUtil.ctod( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( localUtil.ctod( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) )) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es menor que el mínimo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "H", "")) == 0 ) && localUtil.ctot( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).before( localUtil.ctot( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es menor que el mínimo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "C", "")) == 0 ) && ( GXutil.strcmp(AV11CCVal, A4051CCTVal) < 0 ) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es menor que el mínimo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P0AQ24 */
      pr_default.execute(2, new Object[] {AV16EmprCod, Integer.valueOf(AV22CCTCod), Short.valueOf(AV10CCTLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4049CCTValLin = P0AQ24_A4049CCTValLin[0] ;
         A4034CCTLin = P0AQ24_A4034CCTLin[0] ;
         A4031CCTCod = P0AQ24_A4031CCTCod[0] ;
         A396EmprCod = P0AQ24_A396EmprCod[0] ;
         A4051CCTVal = P0AQ24_A4051CCTVal[0] ;
         A4044CCTLinTpoD = P0AQ24_A4044CCTLinTpoD[0] ;
         A4044CCTLinTpoD = P0AQ24_A4044CCTLinTpoD[0] ;
         if ( ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 ) ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( AV11CCVal, "."), CommonUtil.decimalVal( A4051CCTVal, ".")) > 0 ) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es mayor que el máximo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "F", "")) == 0 ) && GXutil.resetTime(localUtil.ctod( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( localUtil.ctod( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) )) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es mayor que el máximo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "H", "")) == 0 ) && localUtil.ctot( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))).after( localUtil.ctot( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es mayor que el máximo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "C", "")) == 0 ) && ( GXutil.strcmp(AV11CCVal, A4051CCTVal) > 0 ) && ( AV9var_ok == 1 ) )
         {
            AV8mensaje = httpContext.getMessage( "El valor ideal es mayor que el máximo permitido.", "") ;
            AV9var_ok = (byte)(0) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'CCDEF2_2' Routine */
      returnInSub = false ;
      /* Using cursor P0AQ25 */
      pr_default.execute(3, new Object[] {AV16EmprCod, Integer.valueOf(AV22CCTCod), Short.valueOf(AV10CCTLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAQ25 = false ;
         A4051CCTVal = P0AQ25_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AQ25_A4050CCTValDsc[0] ;
         A4034CCTLin = P0AQ25_A4034CCTLin[0] ;
         A4031CCTCod = P0AQ25_A4031CCTCod[0] ;
         A396EmprCod = P0AQ25_A396EmprCod[0] ;
         A4044CCTLinTpoD = P0AQ25_A4044CCTLinTpoD[0] ;
         A4049CCTValLin = P0AQ25_A4049CCTValLin[0] ;
         A4044CCTLinTpoD = P0AQ25_A4044CCTLinTpoD[0] ;
         if ( ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 ) || ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "T", "")) == 0 ) ) && ( AV9var_ok == 1 ) )
         {
            AV37GXLvl160 = (byte)(0) ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AQ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AQ25_A4031CCTCod[0] == A4031CCTCod ) && ( P0AQ25_A4034CCTLin[0] == A4034CCTLin ) )
            {
               brkAQ25 = false ;
               A4051CCTVal = P0AQ25_A4051CCTVal[0] ;
               A4050CCTValDsc = P0AQ25_A4050CCTValDsc[0] ;
               A4049CCTValLin = P0AQ25_A4049CCTValLin[0] ;
               if ( DecimalUtil.compareTo(CommonUtil.decimalVal( A4051CCTVal, "."), CommonUtil.decimalVal( AV11CCVal, ".")) == 0 )
               {
                  AV37GXLvl160 = (byte)(1) ;
                  AV12CCTValDsc = A4050CCTValDsc ;
               }
               brkAQ25 = true ;
               pr_default.readNext(3);
            }
            if ( AV37GXLvl160 == 0 )
            {
               AV8mensaje = httpContext.getMessage( "Valor introducido = ", "") + GXutil.trim( AV11CCVal) + GXutil.newLine( ) + httpContext.getMessage( "no existe entre los valores permitidos", "") + GXutil.newLine( ) + httpContext.getMessage( "Valor permitido = ", "") + GXutil.trim( A4051CCTVal) ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "F", "")) == 0 ) && ( AV9var_ok == 1 ) )
         {
            AV38GXLvl171 = (byte)(0) ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AQ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AQ25_A4031CCTCod[0] == A4031CCTCod ) && ( P0AQ25_A4034CCTLin[0] == A4034CCTLin ) )
            {
               brkAQ25 = false ;
               A4051CCTVal = P0AQ25_A4051CCTVal[0] ;
               A4050CCTValDsc = P0AQ25_A4050CCTValDsc[0] ;
               A4049CCTValLin = P0AQ25_A4049CCTValLin[0] ;
               if ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(localUtil.ctod( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )
               {
                  AV38GXLvl171 = (byte)(1) ;
                  AV12CCTValDsc = A4050CCTValDsc ;
               }
               brkAQ25 = true ;
               pr_default.readNext(3);
            }
            if ( AV38GXLvl171 == 0 )
            {
               AV8mensaje = httpContext.getMessage( "Valor introducido = ", "") + GXutil.trim( AV11CCVal) + GXutil.newLine( ) + httpContext.getMessage( "no existe entre los valores permitidos", "") + GXutil.newLine( ) + httpContext.getMessage( "Valor permitido = ", "") + GXutil.trim( A4051CCTVal) ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "H", "")) == 0 ) && ( AV9var_ok == 1 ) )
         {
            AV39GXLvl182 = (byte)(0) ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AQ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AQ25_A4031CCTCod[0] == A4031CCTCod ) && ( P0AQ25_A4034CCTLin[0] == A4034CCTLin ) )
            {
               brkAQ25 = false ;
               A4051CCTVal = P0AQ25_A4051CCTVal[0] ;
               A4050CCTValDsc = P0AQ25_A4050CCTValDsc[0] ;
               A4049CCTValLin = P0AQ25_A4049CCTValLin[0] ;
               if ( GXutil.dateCompare(localUtil.ctot( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.ctot( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )
               {
                  AV39GXLvl182 = (byte)(1) ;
                  AV12CCTValDsc = A4050CCTValDsc ;
               }
               brkAQ25 = true ;
               pr_default.readNext(3);
            }
            if ( AV39GXLvl182 == 0 )
            {
               AV8mensaje = httpContext.getMessage( "Valor introducido = ", "") + GXutil.trim( AV11CCVal) + GXutil.newLine( ) + httpContext.getMessage( "no existe entre los valores permitidos", "") + GXutil.newLine( ) + httpContext.getMessage( "Valor permitido = ", "") + GXutil.trim( A4051CCTVal) ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "C", "")) == 0 ) && ( AV9var_ok == 1 ) )
         {
            AV40GXLvl193 = (byte)(0) ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AQ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AQ25_A4031CCTCod[0] == A4031CCTCod ) && ( P0AQ25_A4034CCTLin[0] == A4034CCTLin ) )
            {
               brkAQ25 = false ;
               A4051CCTVal = P0AQ25_A4051CCTVal[0] ;
               A4050CCTValDsc = P0AQ25_A4050CCTValDsc[0] ;
               A4049CCTValLin = P0AQ25_A4049CCTValLin[0] ;
               if ( GXutil.strcmp(A4051CCTVal, AV11CCVal) == 0 )
               {
                  AV40GXLvl193 = (byte)(1) ;
                  AV12CCTValDsc = A4050CCTValDsc ;
               }
               brkAQ25 = true ;
               pr_default.readNext(3);
            }
            if ( AV40GXLvl193 == 0 )
            {
               AV8mensaje = httpContext.getMessage( "Valor introducido = ", "") + GXutil.trim( AV11CCVal) + GXutil.newLine( ) + httpContext.getMessage( "no existe entre los valores permitidos", "") + GXutil.newLine( ) + httpContext.getMessage( "Valor permitido = ", "") + GXutil.trim( A4051CCTVal) ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( ! brkAQ25 )
         {
            brkAQ25 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP9[0] = controlcalidad_cc1_auditovalorentrado.this.AV8mensaje;
      this.aP10[0] = controlcalidad_cc1_auditovalorentrado.this.AV9var_ok;
      this.aP11[0] = controlcalidad_cc1_auditovalorentrado.this.AV14Mask;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8mensaje = "" ;
      AV14Mask = "" ;
      scmdbuf = "" ;
      P0AQ22_A396EmprCod = new String[] {""} ;
      P0AQ22_A129BarCod = new int[1] ;
      P0AQ22_A132BarCodReo = new byte[1] ;
      P0AQ22_A130BarCodPar = new String[] {""} ;
      P0AQ22_A758ProCod = new String[] {""} ;
      P0AQ22_A194BarOrdLin = new short[1] ;
      P0AQ22_A4031CCTCod = new int[1] ;
      P0AQ22_A4034CCTLin = new short[1] ;
      P0AQ22_A4044CCTLinTpoD = new String[] {""} ;
      P0AQ22_A4045CCTLinLgoD = new short[1] ;
      P0AQ22_A4048CCTLinTpoI = new String[] {""} ;
      P0AQ22_A4046CCTLinPict = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A4044CCTLinTpoD = "" ;
      A4048CCTLinTpoI = "" ;
      A4046CCTLinPict = "" ;
      AV24valor = "" ;
      AV25Length = DecimalUtil.ZERO ;
      AV28c = "" ;
      AV30CCTVal = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_char4 = new String[1] ;
      P0AQ23_A4049CCTValLin = new byte[1] ;
      P0AQ23_A4034CCTLin = new short[1] ;
      P0AQ23_A4031CCTCod = new int[1] ;
      P0AQ23_A396EmprCod = new String[] {""} ;
      P0AQ23_A4051CCTVal = new String[] {""} ;
      P0AQ23_A4044CCTLinTpoD = new String[] {""} ;
      A4051CCTVal = "" ;
      P0AQ24_A4049CCTValLin = new byte[1] ;
      P0AQ24_A4034CCTLin = new short[1] ;
      P0AQ24_A4031CCTCod = new int[1] ;
      P0AQ24_A396EmprCod = new String[] {""} ;
      P0AQ24_A4051CCTVal = new String[] {""} ;
      P0AQ24_A4044CCTLinTpoD = new String[] {""} ;
      A4050CCTValDsc = "" ;
      P0AQ25_A4051CCTVal = new String[] {""} ;
      P0AQ25_A4050CCTValDsc = new String[] {""} ;
      P0AQ25_A4034CCTLin = new short[1] ;
      P0AQ25_A4031CCTCod = new int[1] ;
      P0AQ25_A396EmprCod = new String[] {""} ;
      P0AQ25_A4044CCTLinTpoD = new String[] {""} ;
      P0AQ25_A4049CCTValLin = new byte[1] ;
      AV12CCTValDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc1_auditovalorentrado__default(),
         new Object[] {
             new Object[] {
            P0AQ22_A396EmprCod, P0AQ22_A129BarCod, P0AQ22_A132BarCodReo, P0AQ22_A130BarCodPar, P0AQ22_A758ProCod, P0AQ22_A194BarOrdLin, P0AQ22_A4031CCTCod, P0AQ22_A4034CCTLin, P0AQ22_A4044CCTLinTpoD, P0AQ22_A4045CCTLinLgoD,
            P0AQ22_A4048CCTLinTpoI, P0AQ22_A4046CCTLinPict
            }
            , new Object[] {
            P0AQ23_A4049CCTValLin, P0AQ23_A4034CCTLin, P0AQ23_A4031CCTCod, P0AQ23_A396EmprCod, P0AQ23_A4051CCTVal, P0AQ23_A4044CCTLinTpoD
            }
            , new Object[] {
            P0AQ24_A4049CCTValLin, P0AQ24_A4034CCTLin, P0AQ24_A4031CCTCod, P0AQ24_A396EmprCod, P0AQ24_A4051CCTVal, P0AQ24_A4044CCTLinTpoD
            }
            , new Object[] {
            P0AQ25_A4051CCTVal, P0AQ25_A4050CCTValDsc, P0AQ25_A4034CCTLin, P0AQ25_A4031CCTCod, P0AQ25_A396EmprCod, P0AQ25_A4044CCTLinTpoD, P0AQ25_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18BarCodReo ;
   private byte AV9var_ok ;
   private byte A132BarCodReo ;
   private byte A4049CCTValLin ;
   private byte AV37GXLvl160 ;
   private byte AV38GXLvl171 ;
   private byte AV39GXLvl182 ;
   private byte AV40GXLvl193 ;
   private short AV21BarOrdLin ;
   private short AV10CCTLin ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short AV27i ;
   private short AV29Puntos ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int AV22CCTCod ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal AV25Length ;
   private String AV16EmprCod ;
   private String AV19BarCodPar ;
   private String AV20ProCod ;
   private String AV11CCVal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A4044CCTLinTpoD ;
   private String A4048CCTLinTpoI ;
   private String A4046CCTLinPict ;
   private String AV24valor ;
   private String AV28c ;
   private String AV30CCTVal ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String AV12CCTValDsc ;
   private boolean AV26EsNumerico ;
   private boolean returnInSub ;
   private boolean brkAQ25 ;
   private String AV8mensaje ;
   private String AV14Mask ;
   private String[] aP11 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQ22_A396EmprCod ;
   private int[] P0AQ22_A129BarCod ;
   private byte[] P0AQ22_A132BarCodReo ;
   private String[] P0AQ22_A130BarCodPar ;
   private String[] P0AQ22_A758ProCod ;
   private short[] P0AQ22_A194BarOrdLin ;
   private int[] P0AQ22_A4031CCTCod ;
   private short[] P0AQ22_A4034CCTLin ;
   private String[] P0AQ22_A4044CCTLinTpoD ;
   private short[] P0AQ22_A4045CCTLinLgoD ;
   private String[] P0AQ22_A4048CCTLinTpoI ;
   private String[] P0AQ22_A4046CCTLinPict ;
   private byte[] P0AQ23_A4049CCTValLin ;
   private short[] P0AQ23_A4034CCTLin ;
   private int[] P0AQ23_A4031CCTCod ;
   private String[] P0AQ23_A396EmprCod ;
   private String[] P0AQ23_A4051CCTVal ;
   private String[] P0AQ23_A4044CCTLinTpoD ;
   private byte[] P0AQ24_A4049CCTValLin ;
   private short[] P0AQ24_A4034CCTLin ;
   private int[] P0AQ24_A4031CCTCod ;
   private String[] P0AQ24_A396EmprCod ;
   private String[] P0AQ24_A4051CCTVal ;
   private String[] P0AQ24_A4044CCTLinTpoD ;
   private String[] P0AQ25_A4051CCTVal ;
   private String[] P0AQ25_A4050CCTValDsc ;
   private short[] P0AQ25_A4034CCTLin ;
   private int[] P0AQ25_A4031CCTCod ;
   private String[] P0AQ25_A396EmprCod ;
   private String[] P0AQ25_A4044CCTLinTpoD ;
   private byte[] P0AQ25_A4049CCTValLin ;
}

final  class controlcalidad_cc1_auditovalorentrado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQ22", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin, T2.CCTLinTpoD, T2.CCTLinLgoD, T2.CCTLinTpoI, T2.CCTLinPict FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodPar = ? and T1.BarCodReo = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodPar, T1.BarCodReo, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ23", "SELECT T1.CCTValLin, T1.CCTLin, T1.CCTCod, T1.EmprCod, T1.CCTVal, T2.CCTLinTpoD FROM (TXPCCDef2 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ? and T1.CCTValLin = 1 ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQ24", "SELECT T1.CCTValLin, T1.CCTLin, T1.CCTCod, T1.EmprCod, T1.CCTVal, T2.CCTLinTpoD FROM (TXPCCDef2 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ? and T1.CCTValLin = 2 ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQ25", "SELECT T1.CCTVal, T1.CCTValDsc, T1.CCTLin, T1.CCTCod, T1.EmprCod, T2.CCTLinTpoD, T1.CCTValLin FROM (TXPCCDef2 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

