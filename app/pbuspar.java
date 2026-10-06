package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspar extends GXProcedure
{
   public pbuspar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspar.class ), "" );
   }

   public pbuspar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 )
   {
      pbuspar.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      pbuspar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspar.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbuspar.this.A966PartCod = aP2[0];
      this.aP2 = aP2;
      pbuspar.this.AV15OpeArtCod = aP3[0];
      this.aP3 = aP3;
      pbuspar.this.AV16OpePrcCod = aP4[0];
      this.aP4 = aP4;
      pbuspar.this.AV17OpeNMtr = aP5[0];
      this.aP5 = aP5;
      pbuspar.this.AV18Flag = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      /* Using cursor P00EE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1456ParArtCod = P00EE2_A1456ParArtCod[0] ;
         n1456ParArtCod = P00EE2_n1456ParArtCod[0] ;
         A970ProceCod = P00EE2_A970ProceCod[0] ;
         n970ProceCod = P00EE2_n970ProceCod[0] ;
         A1457ParNMtr = P00EE2_A1457ParNMtr[0] ;
         n1457ParNMtr = P00EE2_n1457ParNMtr[0] ;
         AV15OpeArtCod = A1456ParArtCod ;
         AV16OpePrcCod = A970ProceCod ;
         AV17OpeNMtr = A1457ParNMtr ;
         AV18Flag = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuspar.this.A396EmprCod;
      this.aP1[0] = pbuspar.this.A252CliCod;
      this.aP2[0] = pbuspar.this.A966PartCod;
      this.aP3[0] = pbuspar.this.AV15OpeArtCod;
      this.aP4[0] = pbuspar.this.AV16OpePrcCod;
      this.aP5[0] = pbuspar.this.AV17OpeNMtr;
      this.aP6[0] = pbuspar.this.AV18Flag;
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
      P00EE2_A396EmprCod = new String[] {""} ;
      P00EE2_A966PartCod = new String[] {""} ;
      P00EE2_A252CliCod = new int[1] ;
      P00EE2_A1456ParArtCod = new String[] {""} ;
      P00EE2_n1456ParArtCod = new boolean[] {false} ;
      P00EE2_A970ProceCod = new short[1] ;
      P00EE2_n970ProceCod = new boolean[] {false} ;
      P00EE2_A1457ParNMtr = new String[] {""} ;
      P00EE2_n1457ParNMtr = new boolean[] {false} ;
      A1456ParArtCod = "" ;
      A1457ParNMtr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspar__default(),
         new Object[] {
             new Object[] {
            P00EE2_A396EmprCod, P00EE2_A966PartCod, P00EE2_A252CliCod, P00EE2_A1456ParArtCod, P00EE2_n1456ParArtCod, P00EE2_A970ProceCod, P00EE2_n970ProceCod, P00EE2_A1457ParNMtr, P00EE2_n1457ParNMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Flag ;
   private short AV16OpePrcCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV15OpeArtCod ;
   private String AV17OpeNMtr ;
   private String scmdbuf ;
   private String A1456ParArtCod ;
   private String A1457ParNMtr ;
   private boolean n1456ParArtCod ;
   private boolean n970ProceCod ;
   private boolean n1457ParNMtr ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00EE2_A396EmprCod ;
   private String[] P00EE2_A966PartCod ;
   private int[] P00EE2_A252CliCod ;
   private String[] P00EE2_A1456ParArtCod ;
   private boolean[] P00EE2_n1456ParArtCod ;
   private short[] P00EE2_A970ProceCod ;
   private boolean[] P00EE2_n970ProceCod ;
   private String[] P00EE2_A1457ParNMtr ;
   private boolean[] P00EE2_n1457ParNMtr ;
}

final  class pbuspar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EE2", "SELECT EmprCod, PartCod, CliCod, ParArtCod, ProceCod, ParNMtr FROM TXPCPARTI WHERE EmprCod = ? and CliCod = ? and PartCod = ? ORDER BY EmprCod, CliCod, PartCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

