package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apconvar extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apconvar pgm = new apconvar (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      java.math.BigDecimal[] aP0 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      String[] aP1 = new String[] {""};
      short[] aP2 = new short[] {0};

      try
      {
         aP0[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[0]);
         aP1[0] = (String) args[1];
         aP2[0] = (short) GXutil.lval( args[2]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public apconvar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apconvar.class ), "" );
   }

   public apconvar( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( java.math.BigDecimal[] aP0 ,
                            String[] aP1 )
   {
      apconvar.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      apconvar.this.AV15VNUM2 = aP0[0];
      this.aP0 = aP0;
      apconvar.this.AV16VTEXT1 = aP1[0];
      this.aP1 = aP1;
      apconvar.this.AV18VLTXT = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV38EmprCod ;
      GXv_char2[0] = AV44EmprNom ;
      GXv_char3[0] = AV40UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char1, GXv_char2, GXv_char3) ;
      apconvar.this.AV38EmprCod = GXv_char1[0] ;
      apconvar.this.AV44EmprNom = GXv_char2[0] ;
      apconvar.this.AV40UsurCod = GXv_char3[0] ;
      /* Using cursor P02GN2 */
      pr_default.execute(0, new Object[] {AV38EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P02GN2_A396EmprCod[0] ;
         A3915EmpNumDec = P02GN2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02GN2_n3915EmpNumDec[0] ;
         AV39EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV20VNUM = AV15VNUM2 ;
      AV29VTNUM = GXutil.str( AV20VNUM, 15, 2) ;
      AV41ValDec = (byte)(GXutil.lval( GXutil.substring( AV29VTNUM, 14, 2))) ;
      AV42ValDecD = (byte)(GXutil.lval( GXutil.substring( AV29VTNUM, 14, 1))) ;
      AV43ValDecUni = (byte)(GXutil.lval( GXutil.substring( AV29VTNUM, 15, 1))) ;
      AV22VUNI = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 10, 3))) ;
      AV23VMIL = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 7, 3))) ;
      AV24VUNIM = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 4, 3))) ;
      AV25VMILM = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 1, 3))) ;
      AV45LonText1 = AV18VLTXT ;
      AV19VTEXT = httpContext.getMessage( "( PESOS ", "") ;
      if ( ( AV25VMILM > 0 ) || ( AV25VMILM < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV25VMILM/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV25VMILM-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV25VMILM-AV26CENT*100-AV27DEC*10)) ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         if ( ( AV23VMIL > 1 ) || ( AV23VMIL < 0 ) )
         {
            GXv_char3[0] = AV19VTEXT ;
            GXv_int4[0] = AV26CENT ;
            GXv_int5[0] = AV27DEC ;
            GXv_int6[0] = AV28UNI ;
            GXv_char2[0] = AV36GENERO ;
            GXv_int7[0] = AV39EmpNumDec ;
            new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_int6, GXv_char2, GXv_int7) ;
            apconvar.this.AV19VTEXT = GXv_char3[0] ;
            apconvar.this.AV26CENT = GXv_int4[0] ;
            apconvar.this.AV27DEC = GXv_int5[0] ;
            apconvar.this.AV28UNI = GXv_int6[0] ;
            apconvar.this.AV36GENERO = GXv_char2[0] ;
            apconvar.this.AV39EmpNumDec = GXv_int7[0] ;
         }
         AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MIL", ""), " ") ;
         if ( AV24VUNIM == 0 )
         {
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MILLONES", ""), " ") ;
         }
      }
      if ( ( AV24VUNIM > 0 ) || ( AV24VUNIM < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV24VUNIM/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV24VUNIM-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV24VUNIM-AV26CENT*100-AV27DEC*10)) ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         if ( ( AV24VUNIM > 1 ) || ( AV24VUNIM < 0 ) )
         {
            GXv_char3[0] = AV19VTEXT ;
            GXv_int7[0] = AV26CENT ;
            GXv_int6[0] = AV27DEC ;
            GXv_int5[0] = AV28UNI ;
            GXv_char2[0] = AV36GENERO ;
            GXv_int4[0] = AV39EmpNumDec ;
            new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
            apconvar.this.AV19VTEXT = GXv_char3[0] ;
            apconvar.this.AV26CENT = GXv_int7[0] ;
            apconvar.this.AV27DEC = GXv_int6[0] ;
            apconvar.this.AV28UNI = GXv_int5[0] ;
            apconvar.this.AV36GENERO = GXv_char2[0] ;
            apconvar.this.AV39EmpNumDec = GXv_int4[0] ;
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MILLONES", ""), " ") ;
         }
         else
         {
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "UN MILLON", ""), " ") ;
         }
      }
      if ( ( AV23VMIL > 0 ) || ( AV23VMIL < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV23VMIL/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV23VMIL-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV23VMIL-AV26CENT*100-AV27DEC*10)) ;
         if ( AV39EmpNumDec == 0 )
         {
            AV36GENERO = httpContext.getMessage( "F", "") ;
         }
         else
         {
            if ( AV39EmpNumDec == 2 )
            {
               AV36GENERO = httpContext.getMessage( "M", "") ;
            }
         }
         if ( ( AV23VMIL > 1 ) || ( AV23VMIL < 0 ) )
         {
            GXv_char3[0] = AV19VTEXT ;
            GXv_int7[0] = AV26CENT ;
            GXv_int6[0] = AV27DEC ;
            GXv_int5[0] = AV28UNI ;
            GXv_char2[0] = AV36GENERO ;
            GXv_int4[0] = AV39EmpNumDec ;
            new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
            apconvar.this.AV19VTEXT = GXv_char3[0] ;
            apconvar.this.AV26CENT = GXv_int7[0] ;
            apconvar.this.AV27DEC = GXv_int6[0] ;
            apconvar.this.AV28UNI = GXv_int5[0] ;
            apconvar.this.AV36GENERO = GXv_char2[0] ;
            apconvar.this.AV39EmpNumDec = GXv_int4[0] ;
         }
         AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MIL", ""), " ") ;
      }
      if ( ( AV22VUNI > 0 ) || ( AV22VUNI < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV22VUNI/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV22VUNI-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV22VUNI-AV26CENT*100-AV27DEC*10)) ;
         if ( AV39EmpNumDec == 0 )
         {
            AV36GENERO = httpContext.getMessage( "F", "") ;
         }
         else
         {
            if ( AV39EmpNumDec == 2 )
            {
               AV36GENERO = httpContext.getMessage( "M", "") ;
            }
         }
         GXv_char3[0] = AV19VTEXT ;
         GXv_int7[0] = AV26CENT ;
         GXv_int6[0] = AV27DEC ;
         GXv_int5[0] = AV28UNI ;
         GXv_char2[0] = AV36GENERO ;
         GXv_int4[0] = AV39EmpNumDec ;
         new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
         apconvar.this.AV19VTEXT = GXv_char3[0] ;
         apconvar.this.AV26CENT = GXv_int7[0] ;
         apconvar.this.AV27DEC = GXv_int6[0] ;
         apconvar.this.AV28UNI = GXv_int5[0] ;
         apconvar.this.AV36GENERO = GXv_char2[0] ;
         apconvar.this.AV39EmpNumDec = GXv_int4[0] ;
      }
      AV19VTEXT += httpContext.getMessage( " CON", "") ;
      if ( ( AV41ValDec > 0 ) && ( AV39EmpNumDec == 2 ) )
      {
         AV26CENT = (byte)(0) ;
         AV27DEC = AV42ValDecD ;
         AV28UNI = AV43ValDecUni ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         GXv_char3[0] = AV19VTEXT ;
         GXv_int7[0] = AV26CENT ;
         GXv_int6[0] = AV27DEC ;
         GXv_int5[0] = AV28UNI ;
         GXv_char2[0] = AV36GENERO ;
         GXv_int4[0] = AV39EmpNumDec ;
         new app.pcentar(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
         apconvar.this.AV19VTEXT = GXv_char3[0] ;
         apconvar.this.AV26CENT = GXv_int7[0] ;
         apconvar.this.AV27DEC = GXv_int6[0] ;
         apconvar.this.AV28UNI = GXv_int5[0] ;
         apconvar.this.AV36GENERO = GXv_char2[0] ;
         apconvar.this.AV39EmpNumDec = GXv_int4[0] ;
      }
      while ( GXutil.strcmp(GXutil.substring( AV19VTEXT, AV18VLTXT, 1), " ") != 0 )
      {
         AV18VLTXT = (short)(AV18VLTXT-1) ;
      }
      AV16VTEXT1 = AV19VTEXT + " )" ;
      AV18VLTXT = AV45LonText1 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pconvar.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apconvar.this.AV15VNUM2;
      this.aP1[0] = apconvar.this.AV16VTEXT1;
      this.aP2[0] = apconvar.this.AV18VLTXT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Station = "" ;
      AV38EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV44EmprNom = "" ;
      AV40UsurCod = "" ;
      scmdbuf = "" ;
      P02GN2_A396EmprCod = new String[] {""} ;
      P02GN2_A3915EmpNumDec = new byte[1] ;
      P02GN2_n3915EmpNumDec = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV20VNUM = DecimalUtil.ZERO ;
      AV29VTNUM = "" ;
      AV19VTEXT = "" ;
      AV36GENERO = "" ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apconvar__default(),
         new Object[] {
             new Object[] {
            P02GN2_A396EmprCod, P02GN2_A3915EmpNumDec, P02GN2_n3915EmpNumDec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private byte AV39EmpNumDec ;
   private byte AV41ValDec ;
   private byte AV42ValDecD ;
   private byte AV43ValDecUni ;
   private byte AV26CENT ;
   private byte AV27DEC ;
   private byte AV28UNI ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte GXv_int5[] ;
   private byte GXv_int4[] ;
   private short AV18VLTXT ;
   private short AV22VUNI ;
   private short AV23VMIL ;
   private short AV24VUNIM ;
   private short AV25VMILM ;
   private short AV45LonText1 ;
   private short Gx_err ;
   private java.math.BigDecimal AV15VNUM2 ;
   private java.math.BigDecimal AV20VNUM ;
   private String AV16VTEXT1 ;
   private String AV37Station ;
   private String AV38EmprCod ;
   private String GXv_char1[] ;
   private String AV44EmprNom ;
   private String AV40UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV29VTNUM ;
   private String AV19VTEXT ;
   private String AV36GENERO ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean n3915EmpNumDec ;
   private short[] aP2 ;
   private java.math.BigDecimal[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02GN2_A396EmprCod ;
   private byte[] P02GN2_A3915EmpNumDec ;
   private boolean[] P02GN2_n3915EmpNumDec ;
}

final  class apconvar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02GN2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
      }
   }

}

