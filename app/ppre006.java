package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppre006 extends GXProcedure
{
   public ppre006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppre006.class ), "" );
   }

   public ppre006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ppre006.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppre006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppre006.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      ppre006.this.AV9Txt_fibra = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Pre003 = (byte)(0) ;
      /* Using cursor P04F22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11211Txt_pk = P04F22_A11211Txt_pk[0] ;
         A11210Txt_Fibra = P04F22_A11210Txt_Fibra[0] ;
         A252CliCod = P04F22_A252CliCod[0] ;
         A5362IntCodF = P04F22_A5362IntCodF[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         AV10Pre003 = (byte)(1) ;
         /*
            INSERT RECORD ON TABLE TXPPRE003

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W11210Txt_Fibra = A11210Txt_Fibra ;
         W5362IntCodF = A5362IntCodF ;
         W11211Txt_pk = A11211Txt_pk ;
         A252CliCod = AV8Clicod ;
         A11210Txt_Fibra = AV9Txt_fibra ;
         A11211Txt_pk = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P04F23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11210Txt_Fibra, Byte.valueOf(A5362IntCodF), A11211Txt_pk});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRE003");
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
         A252CliCod = W252CliCod ;
         A11210Txt_Fibra = W11210Txt_Fibra ;
         A5362IntCodF = W5362IntCodF ;
         A11211Txt_pk = W11211Txt_pk ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV10Pre003 == 0 )
      {
         /* Using cursor P04F24 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5362IntCodF = P04F24_A5362IntCodF[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPPRE003

            */
            W396EmprCod = A396EmprCod ;
            W5362IntCodF = A5362IntCodF ;
            A252CliCod = AV8Clicod ;
            A11210Txt_Fibra = AV9Txt_fibra ;
            A11211Txt_pk = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P04F25 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11210Txt_Fibra, Byte.valueOf(A5362IntCodF), A11211Txt_pk});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRE003");
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
            A5362IntCodF = W5362IntCodF ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppre006.this.A396EmprCod;
      this.aP1[0] = ppre006.this.AV8Clicod;
      this.aP2[0] = ppre006.this.AV9Txt_fibra;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppre006");
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
      P04F22_A396EmprCod = new String[] {""} ;
      P04F22_A11211Txt_pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04F22_A11210Txt_Fibra = new String[] {""} ;
      P04F22_A252CliCod = new int[1] ;
      P04F22_A5362IntCodF = new byte[1] ;
      A11211Txt_pk = DecimalUtil.ZERO ;
      A11210Txt_Fibra = "" ;
      W396EmprCod = "" ;
      W11210Txt_Fibra = "" ;
      W11211Txt_pk = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P04F24_A396EmprCod = new String[] {""} ;
      P04F24_A5362IntCodF = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppre006__default(),
         new Object[] {
             new Object[] {
            P04F22_A396EmprCod, P04F22_A11211Txt_pk, P04F22_A11210Txt_Fibra, P04F22_A252CliCod, P04F22_A5362IntCodF
            }
            , new Object[] {
            }
            , new Object[] {
            P04F24_A396EmprCod, P04F24_A5362IntCodF
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Pre003 ;
   private byte A5362IntCodF ;
   private byte W5362IntCodF ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS1495 ;
   private java.math.BigDecimal A11211Txt_pk ;
   private java.math.BigDecimal W11211Txt_pk ;
   private String A396EmprCod ;
   private String AV9Txt_fibra ;
   private String scmdbuf ;
   private String A11210Txt_Fibra ;
   private String W396EmprCod ;
   private String W11210Txt_Fibra ;
   private String Gx_emsg ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04F22_A396EmprCod ;
   private java.math.BigDecimal[] P04F22_A11211Txt_pk ;
   private String[] P04F22_A11210Txt_Fibra ;
   private int[] P04F22_A252CliCod ;
   private byte[] P04F22_A5362IntCodF ;
   private String[] P04F24_A396EmprCod ;
   private byte[] P04F24_A5362IntCodF ;
}

final  class ppre006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04F22", "SELECT EmprCod, Txt_pk, Txt_Fibra, CliCod, IntCodF FROM TXPPRE003 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, Txt_Fibra, IntCodF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04F23", "INSERT INTO TXPPRE003(EmprCod, CliCod, Txt_Fibra, IntCodF, Txt_pk) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRE003")
         ,new ForEachCursor("P04F24", "SELECT EmprCod, IntCodF FROM TXPINTFAC WHERE EmprCod = ? ORDER BY EmprCod, IntCodF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04F25", "INSERT INTO TXPPRE003(EmprCod, CliCod, Txt_Fibra, IntCodF, Txt_pk) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRE003")
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 100);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 100);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               return;
      }
   }

}

