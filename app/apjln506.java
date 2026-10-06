package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln506 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln506 pgm = new apjln506 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln506( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln506.class ), "" );
   }

   public apjln506( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Control Albrec....", "") );
      /* Using cursor P034O2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P034O2_A44AlbRecCod[0] ;
         A396EmprCod = P034O2_A396EmprCod[0] ;
         A1211TipEntCod = P034O2_A1211TipEntCod[0] ;
         n1211TipEntCod = P034O2_n1211TipEntCod[0] ;
         A47AlbREst = P034O2_A47AlbREst[0] ;
         AV11Num_p = 0 ;
         AV12Num_pc = 0 ;
         /* Using cursor P034O3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2157AlbRecMtr = P034O3_A2157AlbRecMtr[0] ;
            A2156AlbRecKgmU = P034O3_A2156AlbRecKgmU[0] ;
            A2155AlbRecKgm = P034O3_A2155AlbRecKgm[0] ;
            A2158AlbRecMtrU = P034O3_A2158AlbRecMtrU[0] ;
            A2159AlbRecPie = P034O3_A2159AlbRecPie[0] ;
            AV11Num_p = (int)(AV11Num_p+1) ;
            if ( ( A2155AlbRecKgm.doubleValue() != 0 ) && ( A2156AlbRecKgmU.doubleValue() != 0 ) && ( A2157AlbRecMtr.doubleValue() == 0 ) )
            {
               AV12Num_pc = (int)(AV12Num_pc+1) ;
            }
            else
            {
               if ( ( A2155AlbRecKgm.doubleValue() != 0 ) && ( A2156AlbRecKgmU.doubleValue() != 0 ) && ( A2157AlbRecMtr.doubleValue() != 0 ) && ( A2158AlbRecMtrU.doubleValue() != 0 ) )
               {
                  AV12Num_pc = (int)(AV12Num_pc+1) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( AV11Num_p == AV12Num_pc ) && ( AV11Num_p > 0 ) && ( AV12Num_pc > 0 ) )
         {
            AV10Albrest = (byte)(1) ;
         }
         if ( ( AV11Num_p != AV12Num_pc ) && ( AV11Num_p > 0 ) )
         {
            AV10Albrest = (byte)(0) ;
         }
         A47AlbREst = AV10Albrest ;
         Gx_msg = httpContext.getMessage( "Albreccod=", "") + GXutil.str( A44AlbRecCod, 8, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P034O4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Control Albrec....", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln506.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln506");
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
      P034O2_A44AlbRecCod = new int[1] ;
      P034O2_A396EmprCod = new String[] {""} ;
      P034O2_A1211TipEntCod = new short[1] ;
      P034O2_n1211TipEntCod = new boolean[] {false} ;
      P034O2_A47AlbREst = new byte[1] ;
      A396EmprCod = "" ;
      P034O3_A396EmprCod = new String[] {""} ;
      P034O3_A44AlbRecCod = new int[1] ;
      P034O3_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P034O3_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P034O3_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P034O3_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P034O3_A2159AlbRecPie = new String[] {""} ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln506__default(),
         new Object[] {
             new Object[] {
            P034O2_A44AlbRecCod, P034O2_A396EmprCod, P034O2_A1211TipEntCod, P034O2_n1211TipEntCod, P034O2_A47AlbREst
            }
            , new Object[] {
            P034O3_A396EmprCod, P034O3_A44AlbRecCod, P034O3_A2157AlbRecMtr, P034O3_A2156AlbRecKgmU, P034O3_A2155AlbRecKgm, P034O3_A2158AlbRecMtrU, P034O3_A2159AlbRecPie
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private byte AV10Albrest ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV11Num_p ;
   private int AV12Num_pc ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String Gx_msg ;
   private boolean n1211TipEntCod ;
   private IDataStoreProvider pr_default ;
   private int[] P034O2_A44AlbRecCod ;
   private String[] P034O2_A396EmprCod ;
   private short[] P034O2_A1211TipEntCod ;
   private boolean[] P034O2_n1211TipEntCod ;
   private byte[] P034O2_A47AlbREst ;
   private String[] P034O3_A396EmprCod ;
   private int[] P034O3_A44AlbRecCod ;
   private java.math.BigDecimal[] P034O3_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P034O3_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P034O3_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P034O3_A2158AlbRecMtrU ;
   private String[] P034O3_A2159AlbRecPie ;
}

final  class apjln506__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P034O2", "SELECT AlbRecCod, EmprCod, TipEntCod, AlbREst FROM TXPALBREC WHERE (EmprCod = '001' and AlbRecCod > 0) AND (TipEntCod = 2) ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P034O3", "SELECT EmprCod, AlbRecCod, AlbRecMtr, AlbRecKgmU, AlbRecKgm, AlbRecMtrU, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P034O4", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

