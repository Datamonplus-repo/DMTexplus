package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apestlprdes extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apestlprdes pgm = new apestlprdes (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apestlprdes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apestlprdes.class ), "" );
   }

   public apestlprdes( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      GXt_char1 = AV13Carpeta ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char2) ;
      apestlprdes.this.GXt_char1 = GXv_char2[0] ;
      AV13Carpeta = GXt_char1 ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      apestlprdes.this.AV10EmprCod = GXv_char2[0] ;
      apestlprdes.this.AV11EmprNom = GXv_char3[0] ;
      apestlprdes.this.AV8UsurCod = GXv_char4[0] ;
      AV16Nominf = GXutil.trim( AV25Pgmdesc) ;
      AV14File = GXutil.trim( AV13Carpeta) + "\\" + GXutil.trim( AV16Nominf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV14File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV18Stat = GXutil.deleteFile( AV14File) ;
      }
      GXt_int5 = AV15hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV14File, GXv_int6) ;
      apestlprdes.this.GXt_int5 = GXv_int6[0] ;
      AV15hnd = (short)(GXt_int5) ;
      AV22Control = httpContext.getMessage( "Estadisticas Consumos Productos ", "") + ";" + GXutil.str( AV12anyo, 4, 0) ;
      GXt_int7 = (byte)(AV18Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV22Control, GXv_int8) ;
      apestlprdes.this.GXt_int7 = GXv_int8[0] ;
      AV18Stat = GXt_int7 ;
      System.out.println( AV22Control );
      AV22Control = httpContext.getMessage( "Producto", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Unidades Consumidas", "") ;
      GXt_int7 = (byte)(AV18Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV22Control, GXv_int8) ;
      apestlprdes.this.GXt_int7 = GXv_int8[0] ;
      AV18Stat = GXt_int7 ;
      System.out.println( AV22Control );
      AV19LastProducto = "" ;
      AV21PrdUniConM = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05YT2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Short.valueOf(AV12anyo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05YT2_A396EmprCod[0] ;
         A681PrdAny = P05YT2_A681PrdAny[0] ;
         A744PrdUniConM = P05YT2_A744PrdUniConM[0] ;
         A718PrdNom = P05YT2_A718PrdNom[0] ;
         A719PrdNum = P05YT2_A719PrdNum[0] ;
         A720PrdNumMes = P05YT2_A720PrdNumMes[0] ;
         A718PrdNom = P05YT2_A718PrdNom[0] ;
         if ( ( GXutil.strcmp(AV19LastProducto, A719PrdNum) != 0 ) && ( GXutil.strcmp(AV19LastProducto, "") != 0 ) )
         {
            AV22Control = AV19LastProducto + ";" + AV20LastNombre + ";" + GXutil.str( AV21PrdUniConM, 10, 2) ;
            GXt_int7 = (byte)(AV18Stat) ;
            GXv_int8[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV22Control, GXv_int8) ;
            apestlprdes.this.GXt_int7 = GXv_int8[0] ;
            AV18Stat = GXt_int7 ;
            System.out.println( AV22Control );
            AV21PrdUniConM = DecimalUtil.doubleToDec(0) ;
         }
         AV21PrdUniConM = AV21PrdUniConM.add(A744PrdUniConM) ;
         AV19LastProducto = A719PrdNum ;
         AV20LastNombre = A718PrdNom ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV22Control = AV19LastProducto + ";" + AV20LastNombre + ";" + GXutil.str( AV21PrdUniConM, 10, 2) ;
      GXt_int7 = (byte)(AV18Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV15hnd, AV22Control, GXv_int8) ;
      apestlprdes.this.GXt_int7 = GXv_int8[0] ;
      AV18Stat = GXt_int7 ;
      System.out.println( AV22Control );
      GXt_int7 = (byte)(AV18Stat) ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV15hnd, GXv_int8) ;
      apestlprdes.this.GXt_int7 = GXv_int8[0] ;
      AV18Stat = GXt_int7 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pestlprdes.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Carpeta = "" ;
      GXt_char1 = "" ;
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV16Nominf = "" ;
      AV25Pgmdesc = "" ;
      AV14File = "" ;
      GXv_int6 = new long[1] ;
      AV22Control = "" ;
      AV19LastProducto = "" ;
      AV21PrdUniConM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05YT2_A396EmprCod = new String[] {""} ;
      P05YT2_A681PrdAny = new short[1] ;
      P05YT2_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05YT2_A718PrdNom = new String[] {""} ;
      P05YT2_A719PrdNum = new String[] {""} ;
      P05YT2_A720PrdNumMes = new byte[1] ;
      A396EmprCod = "" ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV20LastNombre = "" ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apestlprdes__default(),
         new Object[] {
             new Object[] {
            P05YT2_A396EmprCod, P05YT2_A681PrdAny, P05YT2_A744PrdUniConM, P05YT2_A718PrdNom, P05YT2_A719PrdNum, P05YT2_A720PrdNumMes
            }
         }
      );
      AV25Pgmdesc = httpContext.getMessage( "Estadistica Consumos", "") ;
      /* GeneXus formulas. */
      AV25Pgmdesc = httpContext.getMessage( "Estadistica Consumos", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A720PrdNumMes ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short AV18Stat ;
   private short AV15hnd ;
   private short AV12anyo ;
   private short A681PrdAny ;
   private short Gx_err ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal AV21PrdUniConM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private String AV13Carpeta ;
   private String GXt_char1 ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV16Nominf ;
   private String AV25Pgmdesc ;
   private String AV19LastProducto ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV20LastNombre ;
   private boolean Cond_result ;
   private String AV14File ;
   private String AV22Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05YT2_A396EmprCod ;
   private short[] P05YT2_A681PrdAny ;
   private java.math.BigDecimal[] P05YT2_A744PrdUniConM ;
   private String[] P05YT2_A718PrdNom ;
   private String[] P05YT2_A719PrdNum ;
   private byte[] P05YT2_A720PrdNumMes ;
}

final  class apestlprdes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05YT2", "SELECT T1.EmprCod, T1.PrdAny, T1.PrdUniConM, T2.PrdNom, T1.PrdNum, T1.PrdNumMes FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdAny = ? ORDER BY T1.EmprCod, T1.PrdAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

