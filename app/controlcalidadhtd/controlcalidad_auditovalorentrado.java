package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_auditovalorentrado extends GXProcedure
{
   public controlcalidad_auditovalorentrado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_auditovalorentrado.class ), "" );
   }

   public controlcalidad_auditovalorentrado( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             short aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             byte[] aP9 )
   {
      controlcalidad_auditovalorentrado.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        int aP5 ,
                        short aP6 ,
                        String aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             short aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             String[] aP10 )
   {
      controlcalidad_auditovalorentrado.this.A396EmprCod = aP0;
      controlcalidad_auditovalorentrado.this.A252CliCod = aP1;
      controlcalidad_auditovalorentrado.this.A65ArtCod = aP2;
      controlcalidad_auditovalorentrado.this.A4058CCFColNom = aP3;
      controlcalidad_auditovalorentrado.this.A4059CCFColNum = aP4;
      controlcalidad_auditovalorentrado.this.A4031CCTCod = aP5;
      controlcalidad_auditovalorentrado.this.AV10CCTLin = aP6;
      controlcalidad_auditovalorentrado.this.AV11CCVal = aP7;
      controlcalidad_auditovalorentrado.this.aP8 = aP8;
      controlcalidad_auditovalorentrado.this.aP9 = aP9;
      controlcalidad_auditovalorentrado.this.aP10 = aP10;
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
      /* Using cursor P0AOQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(AV10CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4034CCTLin = P0AOQ2_A4034CCTLin[0] ;
         A4044CCTLinTpoD = P0AOQ2_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = P0AOQ2_A4045CCTLinLgoD[0] ;
         A4048CCTLinTpoI = P0AOQ2_A4048CCTLinTpoI[0] ;
         A11530CCSAuto = P0AOQ2_A11530CCSAuto[0] ;
         A4046CCTLinPict = P0AOQ2_A4046CCTLinPict[0] ;
         A4044CCTLinTpoD = P0AOQ2_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = P0AOQ2_A4045CCTLinLgoD[0] ;
         A4048CCTLinTpoI = P0AOQ2_A4048CCTLinTpoI[0] ;
         A4046CCTLinPict = P0AOQ2_A4046CCTLinPict[0] ;
         AV13posicion = (short)(GXutil.strSearch( AV11CCVal, ".", 1)) ;
         if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 )
         {
            AV15var_control = GXutil.trim( GXutil.str( CommonUtil.decimalVal( AV11CCVal, "."), GXutil.len( AV11CCVal), GXutil.len( AV11CCVal)-AV13posicion)) ;
            System.out.println( httpContext.getMessage( "&CCVal=", "")+GXutil.trim( AV11CCVal)+httpContext.getMessage( "&posicion=", "")+GXutil.str( AV13posicion, 4, 0)+httpContext.getMessage( " &var_control=", "")+GXutil.trim( AV15var_control) );
            if ( ! ( GXutil.strcmp(GXutil.trim( GXutil.str( CommonUtil.decimalVal( AV11CCVal, "."), GXutil.len( AV11CCVal), GXutil.len( AV11CCVal)-AV13posicion)), GXutil.trim( AV11CCVal)) == 0 ) )
            {
               AV8mensaje = httpContext.getMessage( "El valor ideal debe ser numérico.", "") ;
               AV9var_ok = (byte)(0) ;
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
            /* Using cursor P0AOQ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4049CCTValLin = P0AOQ3_A4049CCTValLin[0] ;
               A4051CCTVal = P0AOQ3_A4051CCTVal[0] ;
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
            /* Using cursor P0AOQ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4049CCTValLin = P0AOQ4_A4049CCTValLin[0] ;
               A4051CCTVal = P0AOQ4_A4051CCTVal[0] ;
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
         else
         {
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AOQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AOQ2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P0AOQ2_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(P0AOQ2_A4058CCFColNom[0], A4058CCFColNom) == 0 ) )
            {
               if ( ! ( ( P0AOQ2_A4059CCFColNum[0] == A4059CCFColNum ) && ( P0AOQ2_A4031CCTCod[0] == A4031CCTCod ) && ( P0AOQ2_A4034CCTLin[0] == A4034CCTLin ) ) )
               {
                  if (true) break;
               }
               A4044CCTLinTpoD = P0AOQ2_A4044CCTLinTpoD[0] ;
               A4044CCTLinTpoD = P0AOQ2_A4044CCTLinTpoD[0] ;
               if ( ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 ) ) && ( AV9var_ok == 1 ) )
               {
                  AV22GXLvl70 = (byte)(0) ;
                  /* Using cursor P0AOQ5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), AV11CCVal});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A4051CCTVal = P0AOQ5_A4051CCTVal[0] ;
                     A4050CCTValDsc = P0AOQ5_A4050CCTValDsc[0] ;
                     A4049CCTValLin = P0AOQ5_A4049CCTValLin[0] ;
                     AV22GXLvl70 = (byte)(1) ;
                     AV12CCTValDsc = A4050CCTValDsc ;
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
                  if ( AV22GXLvl70 == 0 )
                  {
                     AV8mensaje = httpContext.getMessage( "El valor ideal no existe entre los permitidos.", "") ;
                     AV9var_ok = (byte)(0) ;
                  }
               }
               if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "F", "")) == 0 ) && ( AV9var_ok == 1 ) )
               {
                  AV23GXLvl79 = (byte)(0) ;
                  /* Using cursor P0AOQ6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A4051CCTVal = P0AOQ6_A4051CCTVal[0] ;
                     A4050CCTValDsc = P0AOQ6_A4050CCTValDsc[0] ;
                     A4049CCTValLin = P0AOQ6_A4049CCTValLin[0] ;
                     if ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(localUtil.ctod( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) )
                     {
                        AV23GXLvl79 = (byte)(1) ;
                        AV12CCTValDsc = A4050CCTValDsc ;
                     }
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
                  if ( AV23GXLvl79 == 0 )
                  {
                     AV8mensaje = httpContext.getMessage( "El valor ideal no existe entre los permitidos.", "") ;
                     AV9var_ok = (byte)(0) ;
                  }
               }
               if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "H", "")) == 0 ) && ( AV9var_ok == 1 ) )
               {
                  AV24GXLvl88 = (byte)(0) ;
                  /* Using cursor P0AOQ7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A4051CCTVal = P0AOQ7_A4051CCTVal[0] ;
                     A4050CCTValDsc = P0AOQ7_A4050CCTValDsc[0] ;
                     A4049CCTValLin = P0AOQ7_A4049CCTValLin[0] ;
                     if ( GXutil.dateCompare(localUtil.ctot( A4051CCTVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.ctot( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )
                     {
                        AV24GXLvl88 = (byte)(1) ;
                        AV12CCTValDsc = A4050CCTValDsc ;
                     }
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  if ( AV24GXLvl88 == 0 )
                  {
                     AV8mensaje = httpContext.getMessage( "El valor ideal no existe entre los permitidos.", "") ;
                     AV9var_ok = (byte)(0) ;
                  }
               }
               if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "C", "")) == 0 ) && ( AV9var_ok == 1 ) )
               {
                  AV25GXLvl97 = (byte)(0) ;
                  /* Using cursor P0AOQ8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), AV11CCVal});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A4051CCTVal = P0AOQ8_A4051CCTVal[0] ;
                     A4050CCTValDsc = P0AOQ8_A4050CCTValDsc[0] ;
                     A4049CCTValLin = P0AOQ8_A4049CCTValLin[0] ;
                     AV25GXLvl97 = (byte)(1) ;
                     AV12CCTValDsc = A4050CCTValDsc ;
                     pr_default.readNext(6);
                  }
                  pr_default.close(6);
                  if ( AV25GXLvl97 == 0 )
                  {
                     AV8mensaje = httpContext.getMessage( "El valor ideal no existe entre los permitidos.", "") ;
                     AV9var_ok = (byte)(0) ;
                  }
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
         }
         if ( A11530CCSAuto == 0 )
         {
            GXt_char1 = AV14Mask ;
            GXv_char2[0] = A4046CCTLinPict ;
            GXv_int3[0] = A4045CCTLinLgoD ;
            GXv_char4[0] = GXt_char1 ;
            new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            controlcalidad_auditovalorentrado.this.A4046CCTLinPict = GXv_char2[0] ;
            controlcalidad_auditovalorentrado.this.A4045CCTLinLgoD = (short)((short)(GXv_int3[0])) ;
            controlcalidad_auditovalorentrado.this.GXt_char1 = GXv_char4[0] ;
            AV14Mask = GXt_char1 ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = controlcalidad_auditovalorentrado.this.AV8mensaje;
      this.aP9[0] = controlcalidad_auditovalorentrado.this.AV9var_ok;
      this.aP10[0] = controlcalidad_auditovalorentrado.this.AV14Mask;
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
      P0AOQ2_A396EmprCod = new String[] {""} ;
      P0AOQ2_A252CliCod = new int[1] ;
      P0AOQ2_A65ArtCod = new String[] {""} ;
      P0AOQ2_A4058CCFColNom = new String[] {""} ;
      P0AOQ2_A4059CCFColNum = new int[1] ;
      P0AOQ2_A4031CCTCod = new int[1] ;
      P0AOQ2_A4034CCTLin = new short[1] ;
      P0AOQ2_A4044CCTLinTpoD = new String[] {""} ;
      P0AOQ2_A4045CCTLinLgoD = new short[1] ;
      P0AOQ2_A4048CCTLinTpoI = new String[] {""} ;
      P0AOQ2_A11530CCSAuto = new byte[1] ;
      P0AOQ2_A4046CCTLinPict = new String[] {""} ;
      A4044CCTLinTpoD = "" ;
      A4048CCTLinTpoI = "" ;
      A4046CCTLinPict = "" ;
      AV15var_control = "" ;
      P0AOQ3_A396EmprCod = new String[] {""} ;
      P0AOQ3_A4031CCTCod = new int[1] ;
      P0AOQ3_A4034CCTLin = new short[1] ;
      P0AOQ3_A4049CCTValLin = new byte[1] ;
      P0AOQ3_A4051CCTVal = new String[] {""} ;
      A4051CCTVal = "" ;
      P0AOQ4_A396EmprCod = new String[] {""} ;
      P0AOQ4_A4031CCTCod = new int[1] ;
      P0AOQ4_A4034CCTLin = new short[1] ;
      P0AOQ4_A4049CCTValLin = new byte[1] ;
      P0AOQ4_A4051CCTVal = new String[] {""} ;
      P0AOQ5_A396EmprCod = new String[] {""} ;
      P0AOQ5_A4031CCTCod = new int[1] ;
      P0AOQ5_A4034CCTLin = new short[1] ;
      P0AOQ5_A4051CCTVal = new String[] {""} ;
      P0AOQ5_A4050CCTValDsc = new String[] {""} ;
      P0AOQ5_A4049CCTValLin = new byte[1] ;
      A4050CCTValDsc = "" ;
      AV12CCTValDsc = "" ;
      P0AOQ6_A396EmprCod = new String[] {""} ;
      P0AOQ6_A4031CCTCod = new int[1] ;
      P0AOQ6_A4034CCTLin = new short[1] ;
      P0AOQ6_A4051CCTVal = new String[] {""} ;
      P0AOQ6_A4050CCTValDsc = new String[] {""} ;
      P0AOQ6_A4049CCTValLin = new byte[1] ;
      P0AOQ7_A396EmprCod = new String[] {""} ;
      P0AOQ7_A4031CCTCod = new int[1] ;
      P0AOQ7_A4034CCTLin = new short[1] ;
      P0AOQ7_A4051CCTVal = new String[] {""} ;
      P0AOQ7_A4050CCTValDsc = new String[] {""} ;
      P0AOQ7_A4049CCTValLin = new byte[1] ;
      P0AOQ8_A396EmprCod = new String[] {""} ;
      P0AOQ8_A4031CCTCod = new int[1] ;
      P0AOQ8_A4034CCTLin = new short[1] ;
      P0AOQ8_A4051CCTVal = new String[] {""} ;
      P0AOQ8_A4050CCTValDsc = new String[] {""} ;
      P0AOQ8_A4049CCTValLin = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_auditovalorentrado__default(),
         new Object[] {
             new Object[] {
            P0AOQ2_A396EmprCod, P0AOQ2_A252CliCod, P0AOQ2_A65ArtCod, P0AOQ2_A4058CCFColNom, P0AOQ2_A4059CCFColNum, P0AOQ2_A4031CCTCod, P0AOQ2_A4034CCTLin, P0AOQ2_A4044CCTLinTpoD, P0AOQ2_A4045CCTLinLgoD, P0AOQ2_A4048CCTLinTpoI,
            P0AOQ2_A11530CCSAuto, P0AOQ2_A4046CCTLinPict
            }
            , new Object[] {
            P0AOQ3_A396EmprCod, P0AOQ3_A4031CCTCod, P0AOQ3_A4034CCTLin, P0AOQ3_A4049CCTValLin, P0AOQ3_A4051CCTVal
            }
            , new Object[] {
            P0AOQ4_A396EmprCod, P0AOQ4_A4031CCTCod, P0AOQ4_A4034CCTLin, P0AOQ4_A4049CCTValLin, P0AOQ4_A4051CCTVal
            }
            , new Object[] {
            P0AOQ5_A396EmprCod, P0AOQ5_A4031CCTCod, P0AOQ5_A4034CCTLin, P0AOQ5_A4051CCTVal, P0AOQ5_A4050CCTValDsc, P0AOQ5_A4049CCTValLin
            }
            , new Object[] {
            P0AOQ6_A396EmprCod, P0AOQ6_A4031CCTCod, P0AOQ6_A4034CCTLin, P0AOQ6_A4051CCTVal, P0AOQ6_A4050CCTValDsc, P0AOQ6_A4049CCTValLin
            }
            , new Object[] {
            P0AOQ7_A396EmprCod, P0AOQ7_A4031CCTCod, P0AOQ7_A4034CCTLin, P0AOQ7_A4051CCTVal, P0AOQ7_A4050CCTValDsc, P0AOQ7_A4049CCTValLin
            }
            , new Object[] {
            P0AOQ8_A396EmprCod, P0AOQ8_A4031CCTCod, P0AOQ8_A4034CCTLin, P0AOQ8_A4051CCTVal, P0AOQ8_A4050CCTValDsc, P0AOQ8_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9var_ok ;
   private byte A11530CCSAuto ;
   private byte A4049CCTValLin ;
   private byte AV22GXLvl70 ;
   private byte AV23GXLvl79 ;
   private byte AV24GXLvl88 ;
   private byte AV25GXLvl97 ;
   private short AV10CCTLin ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short AV13posicion ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private long GXv_int3[] ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String AV11CCVal ;
   private String scmdbuf ;
   private String A4044CCTLinTpoD ;
   private String A4048CCTLinTpoI ;
   private String A4046CCTLinPict ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String AV12CCTValDsc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV8mensaje ;
   private String AV14Mask ;
   private String AV15var_control ;
   private String[] aP10 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOQ2_A396EmprCod ;
   private int[] P0AOQ2_A252CliCod ;
   private String[] P0AOQ2_A65ArtCod ;
   private String[] P0AOQ2_A4058CCFColNom ;
   private int[] P0AOQ2_A4059CCFColNum ;
   private int[] P0AOQ2_A4031CCTCod ;
   private short[] P0AOQ2_A4034CCTLin ;
   private String[] P0AOQ2_A4044CCTLinTpoD ;
   private short[] P0AOQ2_A4045CCTLinLgoD ;
   private String[] P0AOQ2_A4048CCTLinTpoI ;
   private byte[] P0AOQ2_A11530CCSAuto ;
   private String[] P0AOQ2_A4046CCTLinPict ;
   private String[] P0AOQ3_A396EmprCod ;
   private int[] P0AOQ3_A4031CCTCod ;
   private short[] P0AOQ3_A4034CCTLin ;
   private byte[] P0AOQ3_A4049CCTValLin ;
   private String[] P0AOQ3_A4051CCTVal ;
   private String[] P0AOQ4_A396EmprCod ;
   private int[] P0AOQ4_A4031CCTCod ;
   private short[] P0AOQ4_A4034CCTLin ;
   private byte[] P0AOQ4_A4049CCTValLin ;
   private String[] P0AOQ4_A4051CCTVal ;
   private String[] P0AOQ5_A396EmprCod ;
   private int[] P0AOQ5_A4031CCTCod ;
   private short[] P0AOQ5_A4034CCTLin ;
   private String[] P0AOQ5_A4051CCTVal ;
   private String[] P0AOQ5_A4050CCTValDsc ;
   private byte[] P0AOQ5_A4049CCTValLin ;
   private String[] P0AOQ6_A396EmprCod ;
   private int[] P0AOQ6_A4031CCTCod ;
   private short[] P0AOQ6_A4034CCTLin ;
   private String[] P0AOQ6_A4051CCTVal ;
   private String[] P0AOQ6_A4050CCTValDsc ;
   private byte[] P0AOQ6_A4049CCTValLin ;
   private String[] P0AOQ7_A396EmprCod ;
   private int[] P0AOQ7_A4031CCTCod ;
   private short[] P0AOQ7_A4034CCTLin ;
   private String[] P0AOQ7_A4051CCTVal ;
   private String[] P0AOQ7_A4050CCTValDsc ;
   private byte[] P0AOQ7_A4049CCTValLin ;
   private String[] P0AOQ8_A396EmprCod ;
   private int[] P0AOQ8_A4031CCTCod ;
   private short[] P0AOQ8_A4034CCTLin ;
   private String[] P0AOQ8_A4051CCTVal ;
   private String[] P0AOQ8_A4050CCTValDsc ;
   private byte[] P0AOQ8_A4049CCTValLin ;
}

final  class controlcalidad_auditovalorentrado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOQ2", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin, T2.CCTLinTpoD, T2.CCTLinLgoD, T2.CCTLinTpoI, T1.CCSAuto, T2.CCTLinPict FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.CCFColNom = ? and T1.CCFColNum = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOQ3", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 1 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOQ4", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = 2 ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOQ5", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (TO_NUMBER(CCTVal) = TO_NUMBER(NVL(TRIM(?), '0'))) ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOQ6", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOQ7", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOQ8", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (CCTVal = ?) ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setString(4, (String)parms[3], 40);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               return;
      }
   }

}

