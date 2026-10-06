package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusser extends GXProcedure
{
   public pbusser( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusser.class ), "" );
   }

   public pbusser( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pbusser.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pbusser.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusser.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pbusser.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbusser.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbusser.this.AV19Serie = aP4[0];
      this.aP4 = aP4;
      pbusser.this.AV20BarSerDsc = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Serie = "" ;
      /* Using cursor P007Y2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P007Y2_A396EmprCod[0] ;
         A129BarCod = P007Y2_A129BarCod[0] ;
         A132BarCodReo = P007Y2_A132BarCodReo[0] ;
         A130BarCodPar = P007Y2_A130BarCodPar[0] ;
         A212BarSer = P007Y2_A212BarSer[0] ;
         A1652BarSerDsc = P007Y2_A1652BarSerDsc[0] ;
         AV19Serie = A212BarSer ;
         AV20BarSerDsc = A1652BarSerDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusser.this.AV15EmprCod;
      this.aP1[0] = pbusser.this.AV16BarCod;
      this.aP2[0] = pbusser.this.AV17BarCodReo;
      this.aP3[0] = pbusser.this.AV18BarCodPar;
      this.aP4[0] = pbusser.this.AV19Serie;
      this.aP5[0] = pbusser.this.AV20BarSerDsc;
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
      P007Y2_A396EmprCod = new String[] {""} ;
      P007Y2_A129BarCod = new int[1] ;
      P007Y2_A132BarCodReo = new byte[1] ;
      P007Y2_A130BarCodPar = new String[] {""} ;
      P007Y2_A212BarSer = new String[] {""} ;
      P007Y2_A1652BarSerDsc = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusser__default(),
         new Object[] {
             new Object[] {
            P007Y2_A396EmprCod, P007Y2_A129BarCod, P007Y2_A132BarCodReo, P007Y2_A130BarCodPar, P007Y2_A212BarSer, P007Y2_A1652BarSerDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19Serie ;
   private String AV20BarSerDsc ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P007Y2_A396EmprCod ;
   private int[] P007Y2_A129BarCod ;
   private byte[] P007Y2_A132BarCodReo ;
   private String[] P007Y2_A130BarCodPar ;
   private String[] P007Y2_A212BarSer ;
   private String[] P007Y2_A1652BarSerDsc ;
}

final  class pbusser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007Y2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, BarSerDsc FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
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
               return;
      }
   }

}

