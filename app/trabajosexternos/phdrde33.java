package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrde33 extends GXProcedure
{
   public phdrde33( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrde33.class ), "" );
   }

   public phdrde33( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           short[] aP2 )
   {
      phdrde33.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 )
   {
      phdrde33.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrde33.this.AV8SalExtAlb = aP1[0];
      this.aP1 = aP1;
      phdrde33.this.AV9SALEXNLN = aP2[0];
      this.aP2 = aP2;
      phdrde33.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Lrexhd = (byte)(0) ;
      /* Using cursor P03JD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8SalExtAlb), Short.valueOf(AV9SALEXNLN)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2714RpExHdAlb = P03JD2_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P03JD2_n2714RpExHdAlb[0] ;
         A6262RpExSalLn = P03JD2_A6262RpExSalLn[0] ;
         n6262RpExSalLn = P03JD2_n6262RpExSalLn[0] ;
         A2248ManCod = P03JD2_A2248ManCod[0] ;
         A2711RpExHdFe = P03JD2_A2711RpExHdFe[0] ;
         A2713RpExHdLi = P03JD2_A2713RpExHdLi[0] ;
         AV10Lrexhd = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrde33.this.A396EmprCod;
      this.aP1[0] = phdrde33.this.AV8SalExtAlb;
      this.aP2[0] = phdrde33.this.AV9SALEXNLN;
      this.aP3[0] = phdrde33.this.AV10Lrexhd;
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
      P03JD2_A396EmprCod = new String[] {""} ;
      P03JD2_A2714RpExHdAlb = new int[1] ;
      P03JD2_n2714RpExHdAlb = new boolean[] {false} ;
      P03JD2_A6262RpExSalLn = new short[1] ;
      P03JD2_n6262RpExSalLn = new boolean[] {false} ;
      P03JD2_A2248ManCod = new short[1] ;
      P03JD2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P03JD2_A2713RpExHdLi = new short[1] ;
      A2711RpExHdFe = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.phdrde33__default(),
         new Object[] {
             new Object[] {
            P03JD2_A396EmprCod, P03JD2_A2714RpExHdAlb, P03JD2_n2714RpExHdAlb, P03JD2_A6262RpExSalLn, P03JD2_n6262RpExSalLn, P03JD2_A2248ManCod, P03JD2_A2711RpExHdFe, P03JD2_A2713RpExHdLi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Lrexhd ;
   private short AV9SALEXNLN ;
   private short A6262RpExSalLn ;
   private short A2248ManCod ;
   private short A2713RpExHdLi ;
   private short Gx_err ;
   private int AV8SalExtAlb ;
   private int A2714RpExHdAlb ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.util.Date A2711RpExHdFe ;
   private boolean n2714RpExHdAlb ;
   private boolean n6262RpExSalLn ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03JD2_A396EmprCod ;
   private int[] P03JD2_A2714RpExHdAlb ;
   private boolean[] P03JD2_n2714RpExHdAlb ;
   private short[] P03JD2_A6262RpExSalLn ;
   private boolean[] P03JD2_n6262RpExSalLn ;
   private short[] P03JD2_A2248ManCod ;
   private java.util.Date[] P03JD2_A2711RpExHdFe ;
   private short[] P03JD2_A2713RpExHdLi ;
}

final  class phdrde33__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03JD2", "SELECT EmprCod, RpExHdAlb, RpExSalLn, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? and RpExHdAlb = ? and RpExSalLn = ? ORDER BY EmprCod, RpExHdAlb, RpExSalLn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((short[]) buf[7])[0] = rslt.getShort(6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

