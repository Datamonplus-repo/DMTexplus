package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvolmaq extends GXProcedure
{
   public pvolmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvolmaq.class ), "" );
   }

   public pvolmaq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           int[] aP3 ,
                           int[] aP4 )
   {
      pvolmaq.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pvolmaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvolmaq.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pvolmaq.this.AV15MaqVolMax = aP2[0];
      this.aP2 = aP2;
      pvolmaq.this.AV16MaqVolMed = aP3[0];
      this.aP3 = aP3;
      pvolmaq.this.AV17MaqVolMin = aP4[0];
      this.aP4 = aP4;
      pvolmaq.this.AV18FlagMaq = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18FlagMaq = (byte)(0) ;
      /* Using cursor P00ND2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A623MaqVolMax = P00ND2_A623MaqVolMax[0] ;
         n623MaqVolMax = P00ND2_n623MaqVolMax[0] ;
         A624MaqVolMed = P00ND2_A624MaqVolMed[0] ;
         n624MaqVolMed = P00ND2_n624MaqVolMed[0] ;
         A625MaqVolMin = P00ND2_A625MaqVolMin[0] ;
         n625MaqVolMin = P00ND2_n625MaqVolMin[0] ;
         AV15MaqVolMax = A623MaqVolMax ;
         AV16MaqVolMed = A624MaqVolMed ;
         AV17MaqVolMin = A625MaqVolMin ;
         AV18FlagMaq = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvolmaq.this.A396EmprCod;
      this.aP1[0] = pvolmaq.this.A602MaqCod;
      this.aP2[0] = pvolmaq.this.AV15MaqVolMax;
      this.aP3[0] = pvolmaq.this.AV16MaqVolMed;
      this.aP4[0] = pvolmaq.this.AV17MaqVolMin;
      this.aP5[0] = pvolmaq.this.AV18FlagMaq;
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
      P00ND2_A396EmprCod = new String[] {""} ;
      P00ND2_A602MaqCod = new String[] {""} ;
      P00ND2_A623MaqVolMax = new int[1] ;
      P00ND2_n623MaqVolMax = new boolean[] {false} ;
      P00ND2_A624MaqVolMed = new int[1] ;
      P00ND2_n624MaqVolMed = new boolean[] {false} ;
      P00ND2_A625MaqVolMin = new int[1] ;
      P00ND2_n625MaqVolMin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvolmaq__default(),
         new Object[] {
             new Object[] {
            P00ND2_A396EmprCod, P00ND2_A602MaqCod, P00ND2_A623MaqVolMax, P00ND2_n623MaqVolMax, P00ND2_A624MaqVolMed, P00ND2_n624MaqVolMed, P00ND2_A625MaqVolMin, P00ND2_n625MaqVolMin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18FlagMaq ;
   private short Gx_err ;
   private int AV15MaqVolMax ;
   private int AV16MaqVolMed ;
   private int AV17MaqVolMin ;
   private int A623MaqVolMax ;
   private int A624MaqVolMed ;
   private int A625MaqVolMin ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private boolean n623MaqVolMax ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ND2_A396EmprCod ;
   private String[] P00ND2_A602MaqCod ;
   private int[] P00ND2_A623MaqVolMax ;
   private boolean[] P00ND2_n623MaqVolMax ;
   private int[] P00ND2_A624MaqVolMed ;
   private boolean[] P00ND2_n624MaqVolMed ;
   private int[] P00ND2_A625MaqVolMin ;
   private boolean[] P00ND2_n625MaqVolMin ;
}

final  class pvolmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ND2", "SELECT EmprCod, MaqCod, MaqVolMax, MaqVolMed, MaqVolMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

