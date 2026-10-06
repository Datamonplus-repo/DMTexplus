package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisalb extends GXProcedure
{
   public pdisalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisalb.class ), "" );
   }

   public pdisalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdisalb.this.aP1 = new int[] {0};
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
      pdisalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisalb.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Kilos = DecimalUtil.doubleToDec(0) ;
      AV16Metros = DecimalUtil.doubleToDec(0) ;
      AV17Piezas = 0 ;
      /* Using cursor P02362 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk2362 = false ;
         A382DisPieKil = P02362_A382DisPieKil[0] ;
         A384DisPieMet = P02362_A384DisPieMet[0] ;
         A44AlbRecCod = P02362_A44AlbRecCod[0] ;
         A380DisPieCod = P02362_A380DisPieCod[0] ;
         AV15Kilos = DecimalUtil.doubleToDec(0) ;
         AV16Metros = DecimalUtil.doubleToDec(0) ;
         AV17Piezas = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P02362_A396EmprCod[0], A396EmprCod) == 0 ) && ( P02362_A361DisCod[0] == A361DisCod ) && ( P02362_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            brk2362 = false ;
            A382DisPieKil = P02362_A382DisPieKil[0] ;
            A384DisPieMet = P02362_A384DisPieMet[0] ;
            A380DisPieCod = P02362_A380DisPieCod[0] ;
            AV15Kilos = AV15Kilos.add(A382DisPieKil) ;
            AV16Metros = AV16Metros.add(A384DisPieMet) ;
            AV17Piezas = (int)(AV17Piezas+1) ;
            AV19AlbRecCod = A44AlbRecCod ;
            brk2362 = true ;
            pr_default.readNext(0);
         }
         /* Execute user subroutine: 'ACTU_DISALB' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! brk2362 )
         {
            brk2362 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'ACTU_DISALB' Routine */
      returnInSub = false ;
      AV18Ok_DisAlb = (byte)(0) ;
      /* Using cursor P02363 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV19AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P02363_A44AlbRecCod[0] ;
         A595Kilos = P02363_A595Kilos[0] ;
         A631Metros = P02363_A631Metros[0] ;
         A673Piezas = P02363_A673Piezas[0] ;
         A595Kilos = AV15Kilos ;
         A631Metros = AV16Metros ;
         A673Piezas = AV17Piezas ;
         AV18Ok_DisAlb = (byte)(1) ;
         /* Using cursor P02364 */
         pr_default.execute(2, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV18Ok_DisAlb == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         A44AlbRecCod = AV19AlbRecCod ;
         A595Kilos = AV15Kilos ;
         A631Metros = AV16Metros ;
         A673Piezas = AV17Piezas ;
         /* Using cursor P02365 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisalb.this.A396EmprCod;
      this.aP1[0] = pdisalb.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisalb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Kilos = DecimalUtil.ZERO ;
      AV16Metros = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02362_A396EmprCod = new String[] {""} ;
      P02362_A361DisCod = new int[1] ;
      P02362_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02362_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02362_A44AlbRecCod = new int[1] ;
      P02362_A380DisPieCod = new String[] {""} ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A380DisPieCod = "" ;
      P02363_A396EmprCod = new String[] {""} ;
      P02363_A361DisCod = new int[1] ;
      P02363_A44AlbRecCod = new int[1] ;
      P02363_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02363_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02363_A673Piezas = new int[1] ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisalb__default(),
         new Object[] {
             new Object[] {
            P02362_A396EmprCod, P02362_A361DisCod, P02362_A382DisPieKil, P02362_A384DisPieMet, P02362_A44AlbRecCod, P02362_A380DisPieCod
            }
            , new Object[] {
            P02363_A396EmprCod, P02363_A361DisCod, P02363_A44AlbRecCod, P02363_A595Kilos, P02363_A631Metros, P02363_A673Piezas
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

   private byte AV18Ok_DisAlb ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV17Piezas ;
   private int A44AlbRecCod ;
   private int AV19AlbRecCod ;
   private int A673Piezas ;
   private int GX_INS35 ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A380DisPieCod ;
   private String Gx_emsg ;
   private boolean brk2362 ;
   private boolean returnInSub ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02362_A396EmprCod ;
   private int[] P02362_A361DisCod ;
   private java.math.BigDecimal[] P02362_A382DisPieKil ;
   private java.math.BigDecimal[] P02362_A384DisPieMet ;
   private int[] P02362_A44AlbRecCod ;
   private String[] P02362_A380DisPieCod ;
   private String[] P02363_A396EmprCod ;
   private int[] P02363_A361DisCod ;
   private int[] P02363_A44AlbRecCod ;
   private java.math.BigDecimal[] P02363_A595Kilos ;
   private java.math.BigDecimal[] P02363_A631Metros ;
   private int[] P02363_A673Piezas ;
}

final  class pdisalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02362", "SELECT EmprCod, DisCod, DisPieKil, DisPieMet, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02363", "SELECT EmprCod, DisCod, AlbRecCod, Kilos, Metros, Piezas FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02364", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P02365", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
      }
   }

}

