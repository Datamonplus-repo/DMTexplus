package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacbquh extends GXProcedure
{
   public pacbquh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacbquh.class ), "" );
   }

   public pacbquh( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pacbquh.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pacbquh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacbquh.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pacbquh.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pacbquh.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pacbquh.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Proforcod = " " ;
      /* Using cursor P02HG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P02HG2_A764ProForCod[0] ;
         A5371FasQuiLin = P02HG2_A5371FasQuiLin[0] ;
         A194BarOrdLin = P02HG2_A194BarOrdLin[0] ;
         AV8Proforcod = A764ProForCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P02HG3 */
      pr_default.execute(1, new Object[] {AV8Proforcod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacbquh.this.A396EmprCod;
      this.aP1[0] = pacbquh.this.A129BarCod;
      this.aP2[0] = pacbquh.this.A132BarCodReo;
      this.aP3[0] = pacbquh.this.A130BarCodPar;
      this.aP4[0] = pacbquh.this.A758ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacbquh");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Proforcod = "" ;
      scmdbuf = "" ;
      P02HG2_A396EmprCod = new String[] {""} ;
      P02HG2_A129BarCod = new int[1] ;
      P02HG2_A132BarCodReo = new byte[1] ;
      P02HG2_A130BarCodPar = new String[] {""} ;
      P02HG2_A758ProCod = new String[] {""} ;
      P02HG2_A764ProForCod = new String[] {""} ;
      P02HG2_A5371FasQuiLin = new short[1] ;
      P02HG2_A194BarOrdLin = new short[1] ;
      A764ProForCod = "" ;
      A118BarAcaQui = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacbquh__default(),
         new Object[] {
             new Object[] {
            P02HG2_A396EmprCod, P02HG2_A129BarCod, P02HG2_A132BarCodReo, P02HG2_A130BarCodPar, P02HG2_A758ProCod, P02HG2_A764ProForCod, P02HG2_A5371FasQuiLin, P02HG2_A194BarOrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A5371FasQuiLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV8Proforcod ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A118BarAcaQui ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02HG2_A396EmprCod ;
   private int[] P02HG2_A129BarCod ;
   private byte[] P02HG2_A132BarCodReo ;
   private String[] P02HG2_A130BarCodPar ;
   private String[] P02HG2_A758ProCod ;
   private String[] P02HG2_A764ProForCod ;
   private short[] P02HG2_A5371FasQuiLin ;
   private short[] P02HG2_A194BarOrdLin ;
}

final  class pacbquh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02HG2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProForCod, FasQuiLin, BarOrdLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02HG3", "UPDATE TXPBARCAD SET BarAcaQui=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

