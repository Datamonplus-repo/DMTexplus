package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puti010 extends GXProcedure
{
   public puti010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puti010.class ), "" );
   }

   public puti010( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             long[] aP9 )
   {
      puti010.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        short[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        long[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             long[] aP9 ,
                             String[] aP10 )
   {
      puti010.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puti010.this.A4492HreBarCod = aP1[0];
      this.aP1 = aP1;
      puti010.this.A4493HreBarReo = aP2[0];
      this.aP2 = aP2;
      puti010.this.A4494HreBarPar = aP3[0];
      this.aP3 = aP3;
      puti010.this.A4495HreNumCie = aP4[0];
      this.aP4 = aP4;
      puti010.this.A4545HreLinMaq = aP5[0];
      this.aP5 = aP5;
      puti010.this.A4550HreLinPro = aP6[0];
      this.aP6 = aP6;
      puti010.this.A4557HreRecLin = aP7[0];
      this.aP7 = aP7;
      puti010.this.AV10Prdnum = aP8[0];
      this.aP8 = aP8;
      puti010.this.AV11CCstklin = aP9[0];
      this.aP9 = aP9;
      puti010.this.AV8HreLote = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n5726HreLote = false ;
      /* Optimized UPDATE. */
      /* Using cursor P051W2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n5726HreLote), AV8HreLote, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
      /* End optimized UPDATE. */
      /* Optimized UPDATE. */
      /* Using cursor P051W3 */
      pr_default.execute(1, new Object[] {AV8HreLote, A396EmprCod, AV10Prdnum, Long.valueOf(AV11CCstklin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = puti010.this.A396EmprCod;
      this.aP1[0] = puti010.this.A4492HreBarCod;
      this.aP2[0] = puti010.this.A4493HreBarReo;
      this.aP3[0] = puti010.this.A4494HreBarPar;
      this.aP4[0] = puti010.this.A4495HreNumCie;
      this.aP5[0] = puti010.this.A4545HreLinMaq;
      this.aP6[0] = puti010.this.A4550HreLinPro;
      this.aP7[0] = puti010.this.A4557HreRecLin;
      this.aP8[0] = puti010.this.AV10Prdnum;
      this.aP9[0] = puti010.this.AV11CCstklin;
      this.aP10[0] = puti010.this.AV8HreLote;
      Application.commitDataStores(context, remoteHandle, pr_default, "puti010");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A5726HreLote = "" ;
      A5722CCStkLot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puti010__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private long AV11CCstklin ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV10Prdnum ;
   private String AV8HreLote ;
   private String A5726HreLote ;
   private String A5722CCStkLot ;
   private boolean n5726HreLote ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private short[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private long[] aP9 ;
   private IDataStoreProvider pr_default ;
}

final  class puti010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P051W2", "UPDATE TXPHISLRE SET HreLote=?  WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? and HreRecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
         ,new UpdateCursor("P051W3", "UPDATE TXPCCSTKS SET CCStkLot=?  WHERE EmprCod = ? and PrdNum = ? and CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

