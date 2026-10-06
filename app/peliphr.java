package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliphr extends GXProcedure
{
   public peliphr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliphr.class ), "" );
   }

   public peliphr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      peliphr.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      peliphr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliphr.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      peliphr.this.A558HisProFec = aP2[0];
      this.aP2 = aP2;
      peliphr.this.A129BarCod = aP3[0];
      this.aP3 = aP3;
      peliphr.this.A132BarCodReo = aP4[0];
      this.aP4 = aP4;
      peliphr.this.A130BarCodPar = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01AC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A602MaqCod, A558HisProFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P01AC2_A561HisProLin[0] ;
         A556HisProEst = P01AC2_A556HisProEst[0] ;
         if ( A556HisProEst != 9 )
         {
            /* Using cursor P01AC3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliphr.this.A396EmprCod;
      this.aP1[0] = peliphr.this.A602MaqCod;
      this.aP2[0] = peliphr.this.A558HisProFec;
      this.aP3[0] = peliphr.this.A129BarCod;
      this.aP4[0] = peliphr.this.A132BarCodReo;
      this.aP5[0] = peliphr.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliphr");
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
      P01AC2_A396EmprCod = new String[] {""} ;
      P01AC2_A602MaqCod = new String[] {""} ;
      P01AC2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01AC2_A129BarCod = new int[1] ;
      P01AC2_A132BarCodReo = new byte[1] ;
      P01AC2_A130BarCodPar = new String[] {""} ;
      P01AC2_A561HisProLin = new int[1] ;
      P01AC2_A556HisProEst = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliphr__default(),
         new Object[] {
             new Object[] {
            P01AC2_A396EmprCod, P01AC2_A602MaqCod, P01AC2_A558HisProFec, P01AC2_A129BarCod, P01AC2_A132BarCodReo, P01AC2_A130BarCodPar, P01AC2_A561HisProLin, P01AC2_A556HisProEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A556HisProEst ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private java.util.Date A558HisProFec ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01AC2_A396EmprCod ;
   private String[] P01AC2_A602MaqCod ;
   private java.util.Date[] P01AC2_A558HisProFec ;
   private int[] P01AC2_A129BarCod ;
   private byte[] P01AC2_A132BarCodReo ;
   private String[] P01AC2_A130BarCodPar ;
   private int[] P01AC2_A561HisProLin ;
   private byte[] P01AC2_A556HisProEst ;
}

final  class peliphr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AC2", "SELECT EmprCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, HisProLin, HisProEst FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MaqCod = ?) AND (HisProFec = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01AC3", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

