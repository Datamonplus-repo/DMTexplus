package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmaqi extends GXProcedure
{
   public pbusmaqi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmaqi.class ), "" );
   }

   public pbusmaqi( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 ,
                           int[] aP4 )
   {
      pbusmaqi.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pbusmaqi.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusmaqi.this.AV16MaqCod = aP1[0];
      this.aP1 = aP1;
      pbusmaqi.this.AV18MaqTinTip = aP2[0];
      this.aP2 = aP2;
      pbusmaqi.this.AV19MaqVolRes = aP3[0];
      this.aP3 = aP3;
      pbusmaqi.this.AV20MaqVolTop = aP4[0];
      this.aP4 = aP4;
      pbusmaqi.this.AV17Flag = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Flag = (byte)(0) ;
      AV18MaqTinTip = "" ;
      AV19MaqVolRes = 0 ;
      AV20MaqVolTop = 0 ;
      /* Using cursor P02012 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P02012_A602MaqCod[0] ;
         A396EmprCod = P02012_A396EmprCod[0] ;
         A619MaqTinTip = P02012_A619MaqTinTip[0] ;
         n619MaqTinTip = P02012_n619MaqTinTip[0] ;
         A2801MaqVolRes = P02012_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P02012_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P02012_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P02012_n2802MaqVolTop[0] ;
         AV18MaqTinTip = A619MaqTinTip ;
         AV19MaqVolRes = A2801MaqVolRes ;
         AV20MaqVolTop = A2802MaqVolTop ;
         AV17Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusmaqi.this.AV15EmprCod;
      this.aP1[0] = pbusmaqi.this.AV16MaqCod;
      this.aP2[0] = pbusmaqi.this.AV18MaqTinTip;
      this.aP3[0] = pbusmaqi.this.AV19MaqVolRes;
      this.aP4[0] = pbusmaqi.this.AV20MaqVolTop;
      this.aP5[0] = pbusmaqi.this.AV17Flag;
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
      P02012_A602MaqCod = new String[] {""} ;
      P02012_A396EmprCod = new String[] {""} ;
      P02012_A619MaqTinTip = new String[] {""} ;
      P02012_n619MaqTinTip = new boolean[] {false} ;
      P02012_A2801MaqVolRes = new int[1] ;
      P02012_n2801MaqVolRes = new boolean[] {false} ;
      P02012_A2802MaqVolTop = new int[1] ;
      P02012_n2802MaqVolTop = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A619MaqTinTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmaqi__default(),
         new Object[] {
             new Object[] {
            P02012_A602MaqCod, P02012_A396EmprCod, P02012_A619MaqTinTip, P02012_n619MaqTinTip, P02012_A2801MaqVolRes, P02012_n2801MaqVolRes, P02012_A2802MaqVolTop, P02012_n2802MaqVolTop
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Flag ;
   private short Gx_err ;
   private int AV19MaqVolRes ;
   private int AV20MaqVolTop ;
   private int A2801MaqVolRes ;
   private int A2802MaqVolTop ;
   private String AV15EmprCod ;
   private String AV16MaqCod ;
   private String AV18MaqTinTip ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A619MaqTinTip ;
   private boolean n619MaqTinTip ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02012_A602MaqCod ;
   private String[] P02012_A396EmprCod ;
   private String[] P02012_A619MaqTinTip ;
   private boolean[] P02012_n619MaqTinTip ;
   private int[] P02012_A2801MaqVolRes ;
   private boolean[] P02012_n2801MaqVolRes ;
   private int[] P02012_A2802MaqVolTop ;
   private boolean[] P02012_n2802MaqVolTop ;
}

final  class pbusmaqi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02012", "SELECT MaqCod, EmprCod, MaqTinTip, MaqVolRes, MaqVolTop FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

