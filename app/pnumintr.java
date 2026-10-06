package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumintr extends GXProcedure
{
   public pnumintr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumintr.class ), "" );
   }

   public pnumintr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pnumintr.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pnumintr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumintr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnumintr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnumintr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnumintr.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02IY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5109RecNumInt = P02IY2_A5109RecNumInt[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = httpContext.getMessage( "NUMINR", "") ;
         GXv_int3[0] = AV8RecNumInt ;
         new app.pnuminr(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         pnumintr.this.A396EmprCod = GXv_char1[0] ;
         pnumintr.this.AV8RecNumInt = GXv_int3[0] ;
         A5109RecNumInt = AV8RecNumInt ;
         /* Using cursor P02IY3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A5109RecNumInt), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumintr.this.A396EmprCod;
      this.aP1[0] = pnumintr.this.A129BarCod;
      this.aP2[0] = pnumintr.this.A132BarCodReo;
      this.aP3[0] = pnumintr.this.A130BarCodPar;
      this.aP4[0] = pnumintr.this.A2804RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumintr");
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
      P02IY2_A396EmprCod = new String[] {""} ;
      P02IY2_A129BarCod = new int[1] ;
      P02IY2_A132BarCodReo = new byte[1] ;
      P02IY2_A130BarCodPar = new String[] {""} ;
      P02IY2_A2804RecLinMaq = new short[1] ;
      P02IY2_A5109RecNumInt = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumintr__default(),
         new Object[] {
             new Object[] {
            P02IY2_A396EmprCod, P02IY2_A129BarCod, P02IY2_A132BarCodReo, P02IY2_A130BarCodPar, P02IY2_A2804RecLinMaq, P02IY2_A5109RecNumInt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A5109RecNumInt ;
   private int AV8RecNumInt ;
   private int GXv_int3[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02IY2_A396EmprCod ;
   private int[] P02IY2_A129BarCod ;
   private byte[] P02IY2_A132BarCodReo ;
   private String[] P02IY2_A130BarCodPar ;
   private short[] P02IY2_A2804RecLinMaq ;
   private int[] P02IY2_A5109RecNumInt ;
}

final  class pnumintr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IY2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecNumInt FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02IY3", "UPDATE TXPRECMAQ SET RecNumInt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

