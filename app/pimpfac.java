package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pimpfac extends GXProcedure
{
   public pimpfac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pimpfac.class ), "" );
   }

   public pimpfac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pimpfac.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pimpfac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pimpfac.this.AV43Albreccod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV44Kilos = DecimalUtil.doubleToDec(0) ;
      AV45Metros = DecimalUtil.doubleToDec(0) ;
      AV46Piezas = 0 ;
      /* Optimized group. */
      /* Using cursor P00372 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV43Albreccod)});
      c595Kilos = P00372_A595Kilos[0] ;
      c631Metros = P00372_A631Metros[0] ;
      c673Piezas = P00372_A673Piezas[0] ;
      pr_default.close(0);
      AV44Kilos = AV44Kilos.add(c595Kilos) ;
      AV45Metros = AV45Metros.add(c631Metros) ;
      AV46Piezas = (int)(AV46Piezas+c673Piezas) ;
      /* End optimized group. */
      /* Using cursor P00373 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV43Albreccod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P00373_A44AlbRecCod[0] ;
         A56AlbRUni = P00373_A56AlbRUni[0] ;
         A58AlbRUniEnt = P00373_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P00373_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P00373_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P00373_A54AlbRPieUti[0] ;
         A47AlbREst = P00373_A47AlbREst[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A58AlbRUniEnt = AV44Kilos ;
            A60AlbRUniUti = AV44Kilos ;
         }
         else
         {
            A58AlbRUniEnt = AV45Metros ;
            A60AlbRUniUti = AV45Metros ;
         }
         A52AlbRPieEnt = AV46Piezas ;
         A54AlbRPieUti = AV46Piezas ;
         A47AlbREst = (byte)(1) ;
         /* Using cursor P00374 */
         pr_default.execute(2, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pimpfac.this.A396EmprCod;
      this.aP1[0] = pimpfac.this.AV43Albreccod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pimpfac");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44Kilos = DecimalUtil.ZERO ;
      AV45Metros = DecimalUtil.ZERO ;
      c595Kilos = DecimalUtil.ZERO ;
      c631Metros = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00372_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00372_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00372_A673Piezas = new int[1] ;
      P00373_A396EmprCod = new String[] {""} ;
      P00373_A44AlbRecCod = new int[1] ;
      P00373_A56AlbRUni = new String[] {""} ;
      P00373_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00373_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00373_A52AlbRPieEnt = new int[1] ;
      P00373_A54AlbRPieUti = new int[1] ;
      P00373_A47AlbREst = new byte[1] ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pimpfac__default(),
         new Object[] {
             new Object[] {
            P00372_A595Kilos, P00372_A631Metros, P00372_A673Piezas
            }
            , new Object[] {
            P00373_A396EmprCod, P00373_A44AlbRecCod, P00373_A56AlbRUni, P00373_A58AlbRUniEnt, P00373_A60AlbRUniUti, P00373_A52AlbRPieEnt, P00373_A54AlbRPieUti, P00373_A47AlbREst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short Gx_err ;
   private int AV43Albreccod ;
   private int AV46Piezas ;
   private int c673Piezas ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal AV44Kilos ;
   private java.math.BigDecimal AV45Metros ;
   private java.math.BigDecimal c595Kilos ;
   private java.math.BigDecimal c631Metros ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00372_A595Kilos ;
   private java.math.BigDecimal[] P00372_A631Metros ;
   private int[] P00372_A673Piezas ;
   private String[] P00373_A396EmprCod ;
   private int[] P00373_A44AlbRecCod ;
   private String[] P00373_A56AlbRUni ;
   private java.math.BigDecimal[] P00373_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P00373_A60AlbRUniUti ;
   private int[] P00373_A52AlbRPieEnt ;
   private int[] P00373_A54AlbRPieUti ;
   private byte[] P00373_A47AlbREst ;
}

final  class pimpfac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00372", "SELECT SUM(Kilos), SUM(Metros), SUM(Piezas) FROM TXPDISALB WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00373", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00374", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

