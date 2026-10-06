package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnuepro extends GXProcedure
{
   public pnuepro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnuepro.class ), "" );
   }

   public pnuepro( int remoteHandle ,
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
      pnuepro.this.aP5 = new short[] {0};
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
      pnuepro.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnuepro.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pnuepro.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnuepro.this.AV18BarParPan = aP3[0];
      this.aP3 = aP3;
      pnuepro.this.AV19ProCod = aP4[0];
      this.aP4 = aP4;
      pnuepro.this.AV20ProFasLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPBARPRO

      */
      A396EmprCod = AV15EmprCod ;
      A129BarCod = AV16BarCod ;
      A132BarCodReo = AV17BarCodReo ;
      A130BarCodPar = AV18BarParPan ;
      A758ProCod = AV19ProCod ;
      A761ProFasLin = AV20ProFasLin ;
      n761ProFasLin = false ;
      /* Using cursor P008R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnuepro.this.AV15EmprCod;
      this.aP1[0] = pnuepro.this.AV16BarCod;
      this.aP2[0] = pnuepro.this.AV17BarCodReo;
      this.aP3[0] = pnuepro.this.AV18BarParPan;
      this.aP4[0] = pnuepro.this.AV19ProCod;
      this.aP5[0] = pnuepro.this.AV20ProFasLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnuepro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnuepro__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short AV20ProFasLin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int GX_INS14 ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String AV18BarParPan ;
   private String AV19ProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String Gx_emsg ;
   private boolean n761ProFasLin ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pnuepro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P008R2", "INSERT INTO TXPBARPRO(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
      }
   }

}

