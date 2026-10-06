package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopinti extends GXProcedure
{
   public pcopinti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopinti.class ), "" );
   }

   public pcopinti( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pcopinti.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pcopinti.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopinti.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pcopinti.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      pcopinti.this.AV18TipColCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Creando tabla PRETIN", "") );
      AV21GXLvl3 = (byte)(0) ;
      /* Using cursor P042W2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ArtCod, Byte.valueOf(AV18TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P042W2_A831TipColCod[0] ;
         A65ArtCod = P042W2_A65ArtCod[0] ;
         A252CliCod = P042W2_A252CliCod[0] ;
         A396EmprCod = P042W2_A396EmprCod[0] ;
         AV21GXLvl3 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV21GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPRETCO

         */
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV16CliCod ;
         A65ArtCod = AV17ArtCod ;
         A831TipColCod = AV18TipColCod ;
         /* Using cursor P042W3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETCO");
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
         /* End Insert */
      }
      /* Using cursor P042W4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A583IntCod = P042W4_A583IntCod[0] ;
         A14255IntAct = P042W4_A14255IntAct[0] ;
         A396EmprCod = P042W4_A396EmprCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPPRETIN

         */
         W396EmprCod = A396EmprCod ;
         W583IntCod = A583IntCod ;
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV16CliCod ;
         A65ArtCod = AV17ArtCod ;
         A831TipColCod = AV18TipColCod ;
         A585IntPreDef = httpContext.getMessage( "N", "") ;
         n585IntPreDef = false ;
         /* Using cursor P042W5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n585IntPreDef), A585IntPreDef});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
         if ( (pr_default.getStatus(3) == 1) )
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
         A583IntCod = W583IntCod ;
         /* End Insert */
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopinti.this.AV15EmprCod;
      this.aP1[0] = pcopinti.this.AV16CliCod;
      this.aP2[0] = pcopinti.this.AV17ArtCod;
      this.aP3[0] = pcopinti.this.AV18TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pcopinti");
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
      P042W2_A831TipColCod = new byte[1] ;
      P042W2_A65ArtCod = new String[] {""} ;
      P042W2_A252CliCod = new int[1] ;
      P042W2_A396EmprCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      P042W4_A583IntCod = new byte[1] ;
      P042W4_A14255IntAct = new String[] {""} ;
      P042W4_A396EmprCod = new String[] {""} ;
      A14255IntAct = "" ;
      W396EmprCod = "" ;
      A585IntPreDef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pcopinti__default(),
         new Object[] {
             new Object[] {
            P042W2_A831TipColCod, P042W2_A65ArtCod, P042W2_A252CliCod, P042W2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P042W4_A583IntCod, P042W4_A14255IntAct, P042W4_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TipColCod ;
   private byte AV21GXLvl3 ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte W583IntCod ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int A252CliCod ;
   private int GX_INS83 ;
   private int GX_INS84 ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String A14255IntAct ;
   private String W396EmprCod ;
   private String A585IntPreDef ;
   private boolean n585IntPreDef ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P042W2_A831TipColCod ;
   private String[] P042W2_A65ArtCod ;
   private int[] P042W2_A252CliCod ;
   private String[] P042W2_A396EmprCod ;
   private byte[] P042W4_A583IntCod ;
   private String[] P042W4_A14255IntAct ;
   private String[] P042W4_A396EmprCod ;
}

final  class pcopinti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P042W2", "SELECT TipColCod, ArtCod, CliCod, EmprCod FROM TXPPRETCO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P042W3", "INSERT INTO TXPPRETCO(EmprCod, CliCod, ArtCod, TipColCod) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETCO")
         ,new ForEachCursor("P042W4", "SELECT IntCod, IntAct, EmprCod FROM TXPINTENS WHERE (IntCod > 0) AND (IntAct = 'S') ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P042W5", "INSERT INTO TXPPRETIN(EmprCod, CliCod, ArtCod, TipColCod, IntCod, IntPreDef, IntPreKgm, IntPreMtr, PreFacCod) VALUES(?, ?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               return;
      }
   }

}

