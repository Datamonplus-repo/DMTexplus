package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbarpcontro extends GXProcedure
{
   public pbarpcontro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbarpcontro.class ), "" );
   }

   public pbarpcontro( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pbarpcontro.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pbarpcontro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbarpcontro.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbarpcontro.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbarpcontro.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbarpcontro.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pbarpcontro.this.AV8ALbPTrocod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ALbPTrocod = (short)(0) ;
      /* Using cursor P05HF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A42AlbPTroCod = P05HF2_A42AlbPTroCod[0] ;
         A30AlbProCod = P05HF2_A30AlbProCod[0] ;
         AV8ALbPTrocod = A42AlbPTroCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbarpcontro.this.A396EmprCod;
      this.aP1[0] = pbarpcontro.this.A129BarCod;
      this.aP2[0] = pbarpcontro.this.A132BarCodReo;
      this.aP3[0] = pbarpcontro.this.A130BarCodPar;
      this.aP4[0] = pbarpcontro.this.A200BarPieCod;
      this.aP5[0] = pbarpcontro.this.AV8ALbPTrocod;
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
      P05HF2_A396EmprCod = new String[] {""} ;
      P05HF2_A129BarCod = new int[1] ;
      P05HF2_A132BarCodReo = new byte[1] ;
      P05HF2_A130BarCodPar = new String[] {""} ;
      P05HF2_A200BarPieCod = new String[] {""} ;
      P05HF2_A42AlbPTroCod = new short[1] ;
      P05HF2_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbarpcontro__default(),
         new Object[] {
             new Object[] {
            P05HF2_A396EmprCod, P05HF2_A129BarCod, P05HF2_A132BarCodReo, P05HF2_A130BarCodPar, P05HF2_A200BarPieCod, P05HF2_A42AlbPTroCod, P05HF2_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8ALbPTrocod ;
   private short A42AlbPTroCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05HF2_A396EmprCod ;
   private int[] P05HF2_A129BarCod ;
   private byte[] P05HF2_A132BarCodReo ;
   private String[] P05HF2_A130BarCodPar ;
   private String[] P05HF2_A200BarPieCod ;
   private short[] P05HF2_A42AlbPTroCod ;
   private long[] P05HF2_A30AlbProCod ;
}

final  class pbarpcontro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05HF2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbProCod FROM TXPLALTRZ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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

