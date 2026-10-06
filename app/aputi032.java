package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputi032 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputi032 pgm = new aputi032 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputi032( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputi032.class ), "" );
   }

   public aputi032( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01KA2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1KA2 = false ;
         A129BarCod = P01KA2_A129BarCod[0] ;
         A396EmprCod = P01KA2_A396EmprCod[0] ;
         A671PieAgr = P01KA2_A671PieAgr[0] ;
         A132BarCodReo = P01KA2_A132BarCodReo[0] ;
         A130BarCodPar = P01KA2_A130BarCodPar[0] ;
         A119BarAgrCod = P01KA2_A119BarAgrCod[0] ;
         A124BarAgrReo = P01KA2_A124BarAgrReo[0] ;
         A122BarAgrPar = P01KA2_A122BarAgrPar[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = AV8Existe ;
         new app.pjln034(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5) ;
         aputi032.this.A396EmprCod = GXv_char1[0] ;
         aputi032.this.A129BarCod = GXv_int2[0] ;
         aputi032.this.A132BarCodReo = GXv_int3[0] ;
         aputi032.this.A130BarCodPar = GXv_char4[0] ;
         aputi032.this.AV8Existe = GXv_int5[0] ;
         if ( AV8Existe == 0 )
         {
            /* Using cursor P01KA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P01KA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01KA2_A129BarCod[0] == A129BarCod ) )
         {
            brk1KA2 = false ;
            A671PieAgr = P01KA2_A671PieAgr[0] ;
            A132BarCodReo = P01KA2_A132BarCodReo[0] ;
            A130BarCodPar = P01KA2_A130BarCodPar[0] ;
            A119BarAgrCod = P01KA2_A119BarAgrCod[0] ;
            A124BarAgrReo = P01KA2_A124BarAgrReo[0] ;
            A122BarAgrPar = P01KA2_A122BarAgrPar[0] ;
            if ( AV8Existe == 0 )
            {
               /* Using cursor P01KA4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            }
            brk1KA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk1KA2 )
         {
            brk1KA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Using cursor P01KA5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk1KA4 = false ;
         A119BarAgrCod = P01KA5_A119BarAgrCod[0] ;
         A396EmprCod = P01KA5_A396EmprCod[0] ;
         A671PieAgr = P01KA5_A671PieAgr[0] ;
         A124BarAgrReo = P01KA5_A124BarAgrReo[0] ;
         A122BarAgrPar = P01KA5_A122BarAgrPar[0] ;
         A129BarCod = P01KA5_A129BarCod[0] ;
         A132BarCodReo = P01KA5_A132BarCodReo[0] ;
         A130BarCodPar = P01KA5_A130BarCodPar[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = A119BarAgrCod ;
         GXv_int5[0] = A124BarAgrReo ;
         GXv_char1[0] = A122BarAgrPar ;
         GXv_int3[0] = AV8Existe ;
         new app.pjln034(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_int3) ;
         aputi032.this.A396EmprCod = GXv_char4[0] ;
         aputi032.this.A119BarAgrCod = GXv_int2[0] ;
         aputi032.this.A124BarAgrReo = GXv_int5[0] ;
         aputi032.this.A122BarAgrPar = GXv_char1[0] ;
         aputi032.this.AV8Existe = GXv_int3[0] ;
         if ( AV8Existe == 0 )
         {
            /* Using cursor P01KA6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         }
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P01KA5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01KA5_A119BarAgrCod[0] == A119BarAgrCod ) )
         {
            brk1KA4 = false ;
            A671PieAgr = P01KA5_A671PieAgr[0] ;
            A124BarAgrReo = P01KA5_A124BarAgrReo[0] ;
            A122BarAgrPar = P01KA5_A122BarAgrPar[0] ;
            A129BarCod = P01KA5_A129BarCod[0] ;
            A132BarCodReo = P01KA5_A132BarCodReo[0] ;
            A130BarCodPar = P01KA5_A130BarCodPar[0] ;
            if ( AV8Existe == 0 )
            {
               /* Using cursor P01KA7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            }
            brk1KA4 = true ;
            pr_default.readNext(3);
         }
         if ( ! brk1KA4 )
         {
            brk1KA4 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
      /* Using cursor P01KA8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk1KA6 = false ;
         A129BarCod = P01KA8_A129BarCod[0] ;
         A396EmprCod = P01KA8_A396EmprCod[0] ;
         A3751PiePeg = P01KA8_A3751PiePeg[0] ;
         n3751PiePeg = P01KA8_n3751PiePeg[0] ;
         A132BarCodReo = P01KA8_A132BarCodReo[0] ;
         A130BarCodPar = P01KA8_A130BarCodPar[0] ;
         A3747BarPegCod = P01KA8_A3747BarPegCod[0] ;
         A3748BarPegReo = P01KA8_A3748BarPegReo[0] ;
         A3749BarPegPar = P01KA8_A3749BarPegPar[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         GXv_int3[0] = AV8Existe ;
         new app.pjln034(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_int3) ;
         aputi032.this.A396EmprCod = GXv_char4[0] ;
         aputi032.this.A129BarCod = GXv_int2[0] ;
         aputi032.this.A132BarCodReo = GXv_int5[0] ;
         aputi032.this.A130BarCodPar = GXv_char1[0] ;
         aputi032.this.AV8Existe = GXv_int3[0] ;
         if ( AV8Existe == 0 )
         {
            /* Using cursor P01KA9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
         }
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P01KA8_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01KA8_A129BarCod[0] == A129BarCod ) )
         {
            brk1KA6 = false ;
            A3751PiePeg = P01KA8_A3751PiePeg[0] ;
            n3751PiePeg = P01KA8_n3751PiePeg[0] ;
            A132BarCodReo = P01KA8_A132BarCodReo[0] ;
            A130BarCodPar = P01KA8_A130BarCodPar[0] ;
            A3747BarPegCod = P01KA8_A3747BarPegCod[0] ;
            A3748BarPegReo = P01KA8_A3748BarPegReo[0] ;
            A3749BarPegPar = P01KA8_A3749BarPegPar[0] ;
            if ( AV8Existe == 0 )
            {
               /* Using cursor P01KA10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
            }
            brk1KA6 = true ;
            pr_default.readNext(6);
         }
         if ( ! brk1KA6 )
         {
            brk1KA6 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
      /* Using cursor P01KA11 */
      pr_default.execute(9);
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk1KA8 = false ;
         A3747BarPegCod = P01KA11_A3747BarPegCod[0] ;
         A396EmprCod = P01KA11_A396EmprCod[0] ;
         A3751PiePeg = P01KA11_A3751PiePeg[0] ;
         n3751PiePeg = P01KA11_n3751PiePeg[0] ;
         A3748BarPegReo = P01KA11_A3748BarPegReo[0] ;
         A3749BarPegPar = P01KA11_A3749BarPegPar[0] ;
         A129BarCod = P01KA11_A129BarCod[0] ;
         A132BarCodReo = P01KA11_A132BarCodReo[0] ;
         A130BarCodPar = P01KA11_A130BarCodPar[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = A3747BarPegCod ;
         GXv_int5[0] = A3748BarPegReo ;
         GXv_char1[0] = A3749BarPegPar ;
         GXv_int3[0] = AV8Existe ;
         new app.pjln034(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_int3) ;
         aputi032.this.A396EmprCod = GXv_char4[0] ;
         aputi032.this.A3747BarPegCod = GXv_int2[0] ;
         aputi032.this.A3748BarPegReo = GXv_int5[0] ;
         aputi032.this.A3749BarPegPar = GXv_char1[0] ;
         aputi032.this.AV8Existe = GXv_int3[0] ;
         if ( AV8Existe == 0 )
         {
            /* Using cursor P01KA12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
         }
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P01KA11_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01KA11_A3747BarPegCod[0] == A3747BarPegCod ) )
         {
            brk1KA8 = false ;
            A3751PiePeg = P01KA11_A3751PiePeg[0] ;
            n3751PiePeg = P01KA11_n3751PiePeg[0] ;
            A3748BarPegReo = P01KA11_A3748BarPegReo[0] ;
            A3749BarPegPar = P01KA11_A3749BarPegPar[0] ;
            A129BarCod = P01KA11_A129BarCod[0] ;
            A132BarCodReo = P01KA11_A132BarCodReo[0] ;
            A130BarCodPar = P01KA11_A130BarCodPar[0] ;
            if ( AV8Existe == 0 )
            {
               /* Using cursor P01KA13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
            }
            brk1KA8 = true ;
            pr_default.readNext(9);
         }
         if ( ! brk1KA8 )
         {
            brk1KA8 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
      /* Using cursor P01KA14 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         brk1KA10 = false ;
         A129BarCod = P01KA14_A129BarCod[0] ;
         A396EmprCod = P01KA14_A396EmprCod[0] ;
         A3757PieFoa = P01KA14_A3757PieFoa[0] ;
         n3757PieFoa = P01KA14_n3757PieFoa[0] ;
         A132BarCodReo = P01KA14_A132BarCodReo[0] ;
         A130BarCodPar = P01KA14_A130BarCodPar[0] ;
         A3753BarFoaCod = P01KA14_A3753BarFoaCod[0] ;
         A3754BarFoaReo = P01KA14_A3754BarFoaReo[0] ;
         A3755BarFoaPar = P01KA14_A3755BarFoaPar[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         GXv_int3[0] = AV8Existe ;
         new app.pjln034(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_int3) ;
         aputi032.this.A396EmprCod = GXv_char4[0] ;
         aputi032.this.A129BarCod = GXv_int2[0] ;
         aputi032.this.A132BarCodReo = GXv_int5[0] ;
         aputi032.this.A130BarCodPar = GXv_char1[0] ;
         aputi032.this.AV8Existe = GXv_int3[0] ;
         if ( AV8Existe == 0 )
         {
            /* Using cursor P01KA15 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
         }
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(P01KA14_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01KA14_A129BarCod[0] == A129BarCod ) )
         {
            brk1KA10 = false ;
            A3757PieFoa = P01KA14_A3757PieFoa[0] ;
            n3757PieFoa = P01KA14_n3757PieFoa[0] ;
            A132BarCodReo = P01KA14_A132BarCodReo[0] ;
            A130BarCodPar = P01KA14_A130BarCodPar[0] ;
            A3753BarFoaCod = P01KA14_A3753BarFoaCod[0] ;
            A3754BarFoaReo = P01KA14_A3754BarFoaReo[0] ;
            A3755BarFoaPar = P01KA14_A3755BarFoaPar[0] ;
            if ( AV8Existe == 0 )
            {
               /* Using cursor P01KA16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
            }
            brk1KA10 = true ;
            pr_default.readNext(12);
         }
         if ( ! brk1KA10 )
         {
            brk1KA10 = true ;
            pr_default.readNext(12);
         }
      }
      pr_default.close(12);
      /* Using cursor P01KA17 */
      pr_default.execute(15);
      while ( (pr_default.getStatus(15) != 101) )
      {
         brk1KA12 = false ;
         A3753BarFoaCod = P01KA17_A3753BarFoaCod[0] ;
         A396EmprCod = P01KA17_A396EmprCod[0] ;
         A3757PieFoa = P01KA17_A3757PieFoa[0] ;
         n3757PieFoa = P01KA17_n3757PieFoa[0] ;
         A3754BarFoaReo = P01KA17_A3754BarFoaReo[0] ;
         A3755BarFoaPar = P01KA17_A3755BarFoaPar[0] ;
         A129BarCod = P01KA17_A129BarCod[0] ;
         A132BarCodReo = P01KA17_A132BarCodReo[0] ;
         A130BarCodPar = P01KA17_A130BarCodPar[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = A3753BarFoaCod ;
         GXv_int5[0] = A3754BarFoaReo ;
         GXv_char1[0] = A3755BarFoaPar ;
         GXv_int3[0] = AV8Existe ;
         new app.pjln034(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_int3) ;
         aputi032.this.A396EmprCod = GXv_char4[0] ;
         aputi032.this.A3753BarFoaCod = GXv_int2[0] ;
         aputi032.this.A3754BarFoaReo = GXv_int5[0] ;
         aputi032.this.A3755BarFoaPar = GXv_char1[0] ;
         aputi032.this.AV8Existe = GXv_int3[0] ;
         if ( AV8Existe == 0 )
         {
            /* Using cursor P01KA18 */
            pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
         }
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(P01KA17_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01KA17_A3753BarFoaCod[0] == A3753BarFoaCod ) )
         {
            brk1KA12 = false ;
            A3757PieFoa = P01KA17_A3757PieFoa[0] ;
            n3757PieFoa = P01KA17_n3757PieFoa[0] ;
            A3754BarFoaReo = P01KA17_A3754BarFoaReo[0] ;
            A3755BarFoaPar = P01KA17_A3755BarFoaPar[0] ;
            A129BarCod = P01KA17_A129BarCod[0] ;
            A132BarCodReo = P01KA17_A132BarCodReo[0] ;
            A130BarCodPar = P01KA17_A130BarCodPar[0] ;
            if ( AV8Existe == 0 )
            {
               /* Using cursor P01KA19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
            }
            brk1KA12 = true ;
            pr_default.readNext(15);
         }
         if ( ! brk1KA12 )
         {
            brk1KA12 = true ;
            pr_default.readNext(15);
         }
      }
      pr_default.close(15);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puti032.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputi032");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01KA2_A129BarCod = new int[1] ;
      P01KA2_A396EmprCod = new String[] {""} ;
      P01KA2_A671PieAgr = new short[1] ;
      P01KA2_A132BarCodReo = new byte[1] ;
      P01KA2_A130BarCodPar = new String[] {""} ;
      P01KA2_A119BarAgrCod = new int[1] ;
      P01KA2_A124BarAgrReo = new byte[1] ;
      P01KA2_A122BarAgrPar = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      P01KA5_A119BarAgrCod = new int[1] ;
      P01KA5_A396EmprCod = new String[] {""} ;
      P01KA5_A671PieAgr = new short[1] ;
      P01KA5_A124BarAgrReo = new byte[1] ;
      P01KA5_A122BarAgrPar = new String[] {""} ;
      P01KA5_A129BarCod = new int[1] ;
      P01KA5_A132BarCodReo = new byte[1] ;
      P01KA5_A130BarCodPar = new String[] {""} ;
      P01KA8_A129BarCod = new int[1] ;
      P01KA8_A396EmprCod = new String[] {""} ;
      P01KA8_A3751PiePeg = new short[1] ;
      P01KA8_n3751PiePeg = new boolean[] {false} ;
      P01KA8_A132BarCodReo = new byte[1] ;
      P01KA8_A130BarCodPar = new String[] {""} ;
      P01KA8_A3747BarPegCod = new int[1] ;
      P01KA8_A3748BarPegReo = new byte[1] ;
      P01KA8_A3749BarPegPar = new String[] {""} ;
      A3749BarPegPar = "" ;
      P01KA11_A3747BarPegCod = new int[1] ;
      P01KA11_A396EmprCod = new String[] {""} ;
      P01KA11_A3751PiePeg = new short[1] ;
      P01KA11_n3751PiePeg = new boolean[] {false} ;
      P01KA11_A3748BarPegReo = new byte[1] ;
      P01KA11_A3749BarPegPar = new String[] {""} ;
      P01KA11_A129BarCod = new int[1] ;
      P01KA11_A132BarCodReo = new byte[1] ;
      P01KA11_A130BarCodPar = new String[] {""} ;
      P01KA14_A129BarCod = new int[1] ;
      P01KA14_A396EmprCod = new String[] {""} ;
      P01KA14_A3757PieFoa = new short[1] ;
      P01KA14_n3757PieFoa = new boolean[] {false} ;
      P01KA14_A132BarCodReo = new byte[1] ;
      P01KA14_A130BarCodPar = new String[] {""} ;
      P01KA14_A3753BarFoaCod = new int[1] ;
      P01KA14_A3754BarFoaReo = new byte[1] ;
      P01KA14_A3755BarFoaPar = new String[] {""} ;
      A3755BarFoaPar = "" ;
      P01KA17_A3753BarFoaCod = new int[1] ;
      P01KA17_A396EmprCod = new String[] {""} ;
      P01KA17_A3757PieFoa = new short[1] ;
      P01KA17_n3757PieFoa = new boolean[] {false} ;
      P01KA17_A3754BarFoaReo = new byte[1] ;
      P01KA17_A3755BarFoaPar = new String[] {""} ;
      P01KA17_A129BarCod = new int[1] ;
      P01KA17_A132BarCodReo = new byte[1] ;
      P01KA17_A130BarCodPar = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputi032__default(),
         new Object[] {
             new Object[] {
            P01KA2_A129BarCod, P01KA2_A396EmprCod, P01KA2_A671PieAgr, P01KA2_A132BarCodReo, P01KA2_A130BarCodPar, P01KA2_A119BarAgrCod, P01KA2_A124BarAgrReo, P01KA2_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01KA5_A119BarAgrCod, P01KA5_A396EmprCod, P01KA5_A671PieAgr, P01KA5_A124BarAgrReo, P01KA5_A122BarAgrPar, P01KA5_A129BarCod, P01KA5_A132BarCodReo, P01KA5_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01KA8_A129BarCod, P01KA8_A396EmprCod, P01KA8_A3751PiePeg, P01KA8_n3751PiePeg, P01KA8_A132BarCodReo, P01KA8_A130BarCodPar, P01KA8_A3747BarPegCod, P01KA8_A3748BarPegReo, P01KA8_A3749BarPegPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01KA11_A3747BarPegCod, P01KA11_A396EmprCod, P01KA11_A3751PiePeg, P01KA11_n3751PiePeg, P01KA11_A3748BarPegReo, P01KA11_A3749BarPegPar, P01KA11_A129BarCod, P01KA11_A132BarCodReo, P01KA11_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01KA14_A129BarCod, P01KA14_A396EmprCod, P01KA14_A3757PieFoa, P01KA14_n3757PieFoa, P01KA14_A132BarCodReo, P01KA14_A130BarCodPar, P01KA14_A3753BarFoaCod, P01KA14_A3754BarFoaReo, P01KA14_A3755BarFoaPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01KA17_A3753BarFoaCod, P01KA17_A396EmprCod, P01KA17_A3757PieFoa, P01KA17_n3757PieFoa, P01KA17_A3754BarFoaReo, P01KA17_A3755BarFoaPar, P01KA17_A129BarCod, P01KA17_A132BarCodReo, P01KA17_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV8Existe ;
   private byte A3748BarPegReo ;
   private byte A3754BarFoaReo ;
   private byte GXv_int5[] ;
   private byte GXv_int3[] ;
   private short A671PieAgr ;
   private short A3751PiePeg ;
   private short A3757PieFoa ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int A3747BarPegCod ;
   private int A3753BarFoaCod ;
   private int GXv_int2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String A3749BarPegPar ;
   private String A3755BarFoaPar ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private boolean brk1KA2 ;
   private boolean brk1KA4 ;
   private boolean brk1KA6 ;
   private boolean n3751PiePeg ;
   private boolean brk1KA8 ;
   private boolean brk1KA10 ;
   private boolean n3757PieFoa ;
   private boolean brk1KA12 ;
   private IDataStoreProvider pr_default ;
   private int[] P01KA2_A129BarCod ;
   private String[] P01KA2_A396EmprCod ;
   private short[] P01KA2_A671PieAgr ;
   private byte[] P01KA2_A132BarCodReo ;
   private String[] P01KA2_A130BarCodPar ;
   private int[] P01KA2_A119BarAgrCod ;
   private byte[] P01KA2_A124BarAgrReo ;
   private String[] P01KA2_A122BarAgrPar ;
   private int[] P01KA5_A119BarAgrCod ;
   private String[] P01KA5_A396EmprCod ;
   private short[] P01KA5_A671PieAgr ;
   private byte[] P01KA5_A124BarAgrReo ;
   private String[] P01KA5_A122BarAgrPar ;
   private int[] P01KA5_A129BarCod ;
   private byte[] P01KA5_A132BarCodReo ;
   private String[] P01KA5_A130BarCodPar ;
   private int[] P01KA8_A129BarCod ;
   private String[] P01KA8_A396EmprCod ;
   private short[] P01KA8_A3751PiePeg ;
   private boolean[] P01KA8_n3751PiePeg ;
   private byte[] P01KA8_A132BarCodReo ;
   private String[] P01KA8_A130BarCodPar ;
   private int[] P01KA8_A3747BarPegCod ;
   private byte[] P01KA8_A3748BarPegReo ;
   private String[] P01KA8_A3749BarPegPar ;
   private int[] P01KA11_A3747BarPegCod ;
   private String[] P01KA11_A396EmprCod ;
   private short[] P01KA11_A3751PiePeg ;
   private boolean[] P01KA11_n3751PiePeg ;
   private byte[] P01KA11_A3748BarPegReo ;
   private String[] P01KA11_A3749BarPegPar ;
   private int[] P01KA11_A129BarCod ;
   private byte[] P01KA11_A132BarCodReo ;
   private String[] P01KA11_A130BarCodPar ;
   private int[] P01KA14_A129BarCod ;
   private String[] P01KA14_A396EmprCod ;
   private short[] P01KA14_A3757PieFoa ;
   private boolean[] P01KA14_n3757PieFoa ;
   private byte[] P01KA14_A132BarCodReo ;
   private String[] P01KA14_A130BarCodPar ;
   private int[] P01KA14_A3753BarFoaCod ;
   private byte[] P01KA14_A3754BarFoaReo ;
   private String[] P01KA14_A3755BarFoaPar ;
   private int[] P01KA17_A3753BarFoaCod ;
   private String[] P01KA17_A396EmprCod ;
   private short[] P01KA17_A3757PieFoa ;
   private boolean[] P01KA17_n3757PieFoa ;
   private byte[] P01KA17_A3754BarFoaReo ;
   private String[] P01KA17_A3755BarFoaPar ;
   private int[] P01KA17_A129BarCod ;
   private byte[] P01KA17_A132BarCodReo ;
   private String[] P01KA17_A130BarCodPar ;
}

final  class aputi032__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01KA2", "SELECT BarCod, EmprCod, PieAgr, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR ORDER BY EmprCod, BarCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01KA3", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P01KA4", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P01KA5", "SELECT BarAgrCod, EmprCod, PieAgr, BarAgrReo, BarAgrPar, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR ORDER BY EmprCod, BarAgrCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01KA6", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P01KA7", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P01KA8", "SELECT BarCod, EmprCod, PiePeg, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG ORDER BY EmprCod, BarCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01KA9", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPegCod = ? AND BarPegReo = ? AND BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P01KA10", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPegCod = ? AND BarPegReo = ? AND BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new ForEachCursor("P01KA11", "SELECT BarPegCod, EmprCod, PiePeg, BarPegReo, BarPegPar, BarCod, BarCodReo, BarCodPar FROM TXPBARPEG ORDER BY EmprCod, BarPegCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01KA12", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPegCod = ? AND BarPegReo = ? AND BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P01KA13", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPegCod = ? AND BarPegReo = ? AND BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new ForEachCursor("P01KA14", "SELECT BarCod, EmprCod, PieFoa, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA ORDER BY EmprCod, BarCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01KA15", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarFoaCod = ? AND BarFoaReo = ? AND BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new UpdateCursor("P01KA16", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarFoaCod = ? AND BarFoaReo = ? AND BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new ForEachCursor("P01KA17", "SELECT BarFoaCod, EmprCod, PieFoa, BarFoaReo, BarFoaPar, BarCod, BarCodReo, BarCodPar FROM TXPBARFOA ORDER BY EmprCod, BarFoaCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01KA18", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarFoaCod = ? AND BarFoaReo = ? AND BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new UpdateCursor("P01KA19", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarFoaCod = ? AND BarFoaReo = ? AND BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

