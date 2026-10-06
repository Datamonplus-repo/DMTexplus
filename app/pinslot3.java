package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinslot3 extends GXProcedure
{
   public pinslot3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinslot3.class ), "" );
   }

   public pinslot3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pinslot3.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pinslot3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinslot3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinslot3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinslot3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P061W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1503BarPart = P061W2_A1503BarPart[0] ;
         A4812BarEncCli = P061W2_A4812BarEncCli[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPINSLOT

         */
         W396EmprCod = A396EmprCod ;
         A13524InsHdr = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         A13525InsMacCod = 0 ;
         n13525InsMacCod = false ;
         A13526InsLote = 0 ;
         n13526InsLote = false ;
         A13527InsEncPda = A4812BarEncCli + GXutil.str( A1503BarPart, 4, 0) ;
         n13527InsEncPda = false ;
         /* Using cursor P061W3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A13524InsHdr, Boolean.valueOf(n13525InsMacCod), Integer.valueOf(A13525InsMacCod), Boolean.valueOf(n13526InsLote), Integer.valueOf(A13526InsLote), Boolean.valueOf(n13527InsEncPda), A13527InsEncPda});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSLOT");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinslot3.this.A396EmprCod;
      this.aP1[0] = pinslot3.this.A129BarCod;
      this.aP2[0] = pinslot3.this.A132BarCodReo;
      this.aP3[0] = pinslot3.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinslot3");
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
      P061W2_A396EmprCod = new String[] {""} ;
      P061W2_A129BarCod = new int[1] ;
      P061W2_A132BarCodReo = new byte[1] ;
      P061W2_A130BarCodPar = new String[] {""} ;
      P061W2_A1503BarPart = new short[1] ;
      P061W2_A4812BarEncCli = new String[] {""} ;
      A4812BarEncCli = "" ;
      W396EmprCod = "" ;
      A13524InsHdr = "" ;
      A13527InsEncPda = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinslot3__default(),
         new Object[] {
             new Object[] {
            P061W2_A396EmprCod, P061W2_A129BarCod, P061W2_A132BarCodReo, P061W2_A130BarCodPar, P061W2_A1503BarPart, P061W2_A4812BarEncCli
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1503BarPart ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GX_INS1851 ;
   private int A13525InsMacCod ;
   private int A13526InsLote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A4812BarEncCli ;
   private String W396EmprCod ;
   private String A13524InsHdr ;
   private String A13527InsEncPda ;
   private String Gx_emsg ;
   private boolean n13525InsMacCod ;
   private boolean n13526InsLote ;
   private boolean n13527InsEncPda ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P061W2_A396EmprCod ;
   private int[] P061W2_A129BarCod ;
   private byte[] P061W2_A132BarCodReo ;
   private String[] P061W2_A130BarCodPar ;
   private short[] P061W2_A1503BarPart ;
   private String[] P061W2_A4812BarEncCli ;
}

final  class pinslot3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P061W2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPart, BarEncCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P061W3", "INSERT INTO TXPINSLOT(EmprCod, InsHdr, InsMacCod, InsLote, InsEncPda) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSLOT")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 24);
               }
               return;
      }
   }

}

