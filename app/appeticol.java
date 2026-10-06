package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appeticol extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appeticol pgm = new appeticol (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appeticol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appeticol.class ), "" );
   }

   public appeticol( int remoteHandle ,
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
      AV14EmprCod = "001" ;
      AV21GXLvl6 = (byte)(0) ;
      /* Using cursor P03HO2 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, AV18BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P03HO2_A200BarPieCod[0] ;
         A130BarCodPar = P03HO2_A130BarCodPar[0] ;
         A132BarCodReo = P03HO2_A132BarCodReo[0] ;
         A129BarCod = P03HO2_A129BarCod[0] ;
         A396EmprCod = P03HO2_A396EmprCod[0] ;
         AV21GXLvl6 = (byte)(1) ;
         GXv_char1[0] = AV14EmprCod ;
         GXv_int2[0] = AV15BarCod ;
         GXv_int3[0] = AV16BarCodReo ;
         GXv_char4[0] = AV17BarCodPar ;
         GXv_char5[0] = AV18BarPieCod ;
         new app.reticol(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5) ;
         appeticol.this.AV14EmprCod = GXv_char1[0] ;
         appeticol.this.AV15BarCod = GXv_int2[0] ;
         appeticol.this.AV16BarCodReo = GXv_int3[0] ;
         appeticol.this.AV17BarCodPar = GXv_char4[0] ;
         appeticol.this.AV18BarPieCod = GXv_char5[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV21GXLvl6 == 0 )
      {
         Gx_msg = httpContext.getMessage( "HDR : ", "") + GXutil.trim( GXutil.str( AV15BarCod, 10, 0)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "R : ", "") + GXutil.trim( GXutil.str( AV16BarCodReo, 10, 0)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "P : ", "") + GXutil.trim( AV17BarCodPar) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Pieza : ", "") + GXutil.trim( AV18BarPieCod) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppeticol.class);
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
      AV14EmprCod = "" ;
      scmdbuf = "" ;
      AV17BarCodPar = "" ;
      AV18BarPieCod = "" ;
      P03HO2_A200BarPieCod = new String[] {""} ;
      P03HO2_A130BarCodPar = new String[] {""} ;
      P03HO2_A132BarCodReo = new byte[1] ;
      P03HO2_A129BarCod = new int[1] ;
      P03HO2_A396EmprCod = new String[] {""} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.appeticol__default(),
         new Object[] {
             new Object[] {
            P03HO2_A200BarPieCod, P03HO2_A130BarCodPar, P03HO2_A132BarCodReo, P03HO2_A129BarCod, P03HO2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl6 ;
   private byte AV16BarCodReo ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String AV17BarCodPar ;
   private String AV18BarPieCod ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private String[] P03HO2_A200BarPieCod ;
   private String[] P03HO2_A130BarCodPar ;
   private byte[] P03HO2_A132BarCodReo ;
   private int[] P03HO2_A129BarCod ;
   private String[] P03HO2_A396EmprCod ;
}

final  class appeticol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03HO2", "SELECT BarPieCod, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

