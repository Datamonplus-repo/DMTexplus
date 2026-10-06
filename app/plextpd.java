package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plextpd extends GXProcedure
{
   public plextpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plextpd.class ), "" );
   }

   public plextpd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            int[] aP3 ,
                            byte[] aP4 ,
                            java.math.BigDecimal[] aP5 )
   {
      plextpd.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 )
   {
      plextpd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plextpd.this.A2333ExtPdoAlb = aP1[0];
      this.aP1 = aP1;
      plextpd.this.A966PartCod = aP2[0];
      this.aP2 = aP2;
      plextpd.this.A252CliCod = aP3[0];
      this.aP3 = aP3;
      plextpd.this.AV15FlagLin = aP4[0];
      this.aP4 = aP4;
      plextpd.this.AV16Kgs = aP5[0];
      this.aP5 = aP5;
      plextpd.this.AV17Conos = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagLin = (byte)(0) ;
      /* Using cursor P00DU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A2333ExtPdoAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2335ExtPdoEst = P00DU2_A2335ExtPdoEst[0] ;
         n2335ExtPdoEst = P00DU2_n2335ExtPdoEst[0] ;
         A2340ExtPdoKgR = P00DU2_A2340ExtPdoKgR[0] ;
         n2340ExtPdoKgR = P00DU2_n2340ExtPdoKgR[0] ;
         A2338ExtPdoKgE = P00DU2_A2338ExtPdoKgE[0] ;
         n2338ExtPdoKgE = P00DU2_n2338ExtPdoKgE[0] ;
         A2341ExtPdoCnR = P00DU2_A2341ExtPdoCnR[0] ;
         n2341ExtPdoCnR = P00DU2_n2341ExtPdoCnR[0] ;
         A2339ExtPdoCnE = P00DU2_A2339ExtPdoCnE[0] ;
         n2339ExtPdoCnE = P00DU2_n2339ExtPdoCnE[0] ;
         A2790ExtPdoLin = P00DU2_A2790ExtPdoLin[0] ;
         AV15FlagLin = (byte)(1) ;
         AV16Kgs = A2338ExtPdoKgE.subtract(A2340ExtPdoKgR) ;
         AV17Conos = (short)(A2339ExtPdoCnE-A2341ExtPdoCnR) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plextpd.this.A396EmprCod;
      this.aP1[0] = plextpd.this.A2333ExtPdoAlb;
      this.aP2[0] = plextpd.this.A966PartCod;
      this.aP3[0] = plextpd.this.A252CliCod;
      this.aP4[0] = plextpd.this.AV15FlagLin;
      this.aP5[0] = plextpd.this.AV16Kgs;
      this.aP6[0] = plextpd.this.AV17Conos;
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
      P00DU2_A396EmprCod = new String[] {""} ;
      P00DU2_A2333ExtPdoAlb = new int[1] ;
      P00DU2_A966PartCod = new String[] {""} ;
      P00DU2_n966PartCod = new boolean[] {false} ;
      P00DU2_A252CliCod = new int[1] ;
      P00DU2_n252CliCod = new boolean[] {false} ;
      P00DU2_A2335ExtPdoEst = new byte[1] ;
      P00DU2_n2335ExtPdoEst = new boolean[] {false} ;
      P00DU2_A2340ExtPdoKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DU2_n2340ExtPdoKgR = new boolean[] {false} ;
      P00DU2_A2338ExtPdoKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DU2_n2338ExtPdoKgE = new boolean[] {false} ;
      P00DU2_A2341ExtPdoCnR = new int[1] ;
      P00DU2_n2341ExtPdoCnR = new boolean[] {false} ;
      P00DU2_A2339ExtPdoCnE = new short[1] ;
      P00DU2_n2339ExtPdoCnE = new boolean[] {false} ;
      P00DU2_A2790ExtPdoLin = new short[1] ;
      A2340ExtPdoKgR = DecimalUtil.ZERO ;
      A2338ExtPdoKgE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plextpd__default(),
         new Object[] {
             new Object[] {
            P00DU2_A396EmprCod, P00DU2_A2333ExtPdoAlb, P00DU2_A966PartCod, P00DU2_n966PartCod, P00DU2_A252CliCod, P00DU2_n252CliCod, P00DU2_A2335ExtPdoEst, P00DU2_n2335ExtPdoEst, P00DU2_A2340ExtPdoKgR, P00DU2_n2340ExtPdoKgR,
            P00DU2_A2338ExtPdoKgE, P00DU2_n2338ExtPdoKgE, P00DU2_A2341ExtPdoCnR, P00DU2_n2341ExtPdoCnR, P00DU2_A2339ExtPdoCnE, P00DU2_n2339ExtPdoCnE, P00DU2_A2790ExtPdoLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagLin ;
   private byte A2335ExtPdoEst ;
   private short AV17Conos ;
   private short A2339ExtPdoCnE ;
   private short A2790ExtPdoLin ;
   private short Gx_err ;
   private int A2333ExtPdoAlb ;
   private int A252CliCod ;
   private int A2341ExtPdoCnR ;
   private java.math.BigDecimal AV16Kgs ;
   private java.math.BigDecimal A2340ExtPdoKgR ;
   private java.math.BigDecimal A2338ExtPdoKgE ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n2335ExtPdoEst ;
   private boolean n2340ExtPdoKgR ;
   private boolean n2338ExtPdoKgE ;
   private boolean n2341ExtPdoCnR ;
   private boolean n2339ExtPdoCnE ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DU2_A396EmprCod ;
   private int[] P00DU2_A2333ExtPdoAlb ;
   private String[] P00DU2_A966PartCod ;
   private boolean[] P00DU2_n966PartCod ;
   private int[] P00DU2_A252CliCod ;
   private boolean[] P00DU2_n252CliCod ;
   private byte[] P00DU2_A2335ExtPdoEst ;
   private boolean[] P00DU2_n2335ExtPdoEst ;
   private java.math.BigDecimal[] P00DU2_A2340ExtPdoKgR ;
   private boolean[] P00DU2_n2340ExtPdoKgR ;
   private java.math.BigDecimal[] P00DU2_A2338ExtPdoKgE ;
   private boolean[] P00DU2_n2338ExtPdoKgE ;
   private int[] P00DU2_A2341ExtPdoCnR ;
   private boolean[] P00DU2_n2341ExtPdoCnR ;
   private short[] P00DU2_A2339ExtPdoCnE ;
   private boolean[] P00DU2_n2339ExtPdoCnE ;
   private short[] P00DU2_A2790ExtPdoLin ;
}

final  class plextpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DU2", "SELECT EmprCod, ExtPdoAlb, PartCod, CliCod, ExtPdoEst, ExtPdoKgR, ExtPdoKgE, ExtPdoCnR, ExtPdoCnE, ExtPdoLin FROM TXPLEXTPD WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (ExtPdoAlb = ?) ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
      }
   }

}

