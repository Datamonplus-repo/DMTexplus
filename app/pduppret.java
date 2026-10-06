package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pduppret extends GXProcedure
{
   public pduppret( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pduppret.class ), "" );
   }

   public pduppret( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pduppret.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pduppret.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pduppret.this.AV8CliOri = aP1[0];
      this.aP1 = aP1;
      pduppret.this.AV9CliDes = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P039L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliOri)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P039L2_A252CliCod[0] ;
         A8521PreTAICod = P039L2_A8521PreTAICod[0] ;
         W252CliCod = A252CliCod ;
         /*
            INSERT RECORD ON TABLE TXPPRETAI

         */
         W8521PreTAICod = A8521PreTAICod ;
         W252CliCod = A252CliCod ;
         A252CliCod = AV9CliDes ;
         /* Using cursor P039L3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8521PreTAICod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETAI");
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
         A8521PreTAICod = W8521PreTAICod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         /* Using cursor P039L4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8521PreTAICod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A8525PreTAITpo = P039L4_A8525PreTAITpo[0] ;
            n8525PreTAITpo = P039L4_n8525PreTAITpo[0] ;
            A8524PreTAIDto = P039L4_A8524PreTAIDto[0] ;
            n8524PreTAIDto = P039L4_n8524PreTAIDto[0] ;
            A8523PreTAIImp = P039L4_A8523PreTAIImp[0] ;
            n8523PreTAIImp = P039L4_n8523PreTAIImp[0] ;
            A583IntCod = P039L4_A583IntCod[0] ;
            W252CliCod = A252CliCod ;
            W8521PreTAICod = A8521PreTAICod ;
            /*
               INSERT RECORD ON TABLE TXPPRETA1

            */
            W8521PreTAICod = A8521PreTAICod ;
            W583IntCod = A583IntCod ;
            W252CliCod = A252CliCod ;
            A252CliCod = AV9CliDes ;
            /* Using cursor P039L5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8521PreTAICod), Byte.valueOf(A583IntCod), Boolean.valueOf(n8523PreTAIImp), A8523PreTAIImp, Boolean.valueOf(n8524PreTAIDto), A8524PreTAIDto, Boolean.valueOf(n8525PreTAITpo), A8525PreTAITpo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETA1");
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
            A8521PreTAICod = W8521PreTAICod ;
            A583IntCod = W583IntCod ;
            A252CliCod = W252CliCod ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A8521PreTAICod = W8521PreTAICod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A252CliCod = W252CliCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pduppret.this.A396EmprCod;
      this.aP1[0] = pduppret.this.AV8CliOri;
      this.aP2[0] = pduppret.this.AV9CliDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pduppret");
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
      P039L2_A396EmprCod = new String[] {""} ;
      P039L2_A252CliCod = new int[1] ;
      P039L2_A8521PreTAICod = new short[1] ;
      Gx_emsg = "" ;
      P039L4_A396EmprCod = new String[] {""} ;
      P039L4_A252CliCod = new int[1] ;
      P039L4_A8521PreTAICod = new short[1] ;
      P039L4_A8525PreTAITpo = new String[] {""} ;
      P039L4_n8525PreTAITpo = new boolean[] {false} ;
      P039L4_A8524PreTAIDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039L4_n8524PreTAIDto = new boolean[] {false} ;
      P039L4_A8523PreTAIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039L4_n8523PreTAIImp = new boolean[] {false} ;
      P039L4_A583IntCod = new byte[1] ;
      A8525PreTAITpo = "" ;
      A8524PreTAIDto = DecimalUtil.ZERO ;
      A8523PreTAIImp = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pduppret__default(),
         new Object[] {
             new Object[] {
            P039L2_A396EmprCod, P039L2_A252CliCod, P039L2_A8521PreTAICod
            }
            , new Object[] {
            }
            , new Object[] {
            P039L4_A396EmprCod, P039L4_A252CliCod, P039L4_A8521PreTAICod, P039L4_A8525PreTAITpo, P039L4_n8525PreTAITpo, P039L4_A8524PreTAIDto, P039L4_n8524PreTAIDto, P039L4_A8523PreTAIImp, P039L4_n8523PreTAIImp, P039L4_A583IntCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte W583IntCod ;
   private short A8521PreTAICod ;
   private short W8521PreTAICod ;
   private short Gx_err ;
   private int AV8CliOri ;
   private int AV9CliDes ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS1168 ;
   private int GX_INS1169 ;
   private java.math.BigDecimal A8524PreTAIDto ;
   private java.math.BigDecimal A8523PreTAIImp ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String A8525PreTAITpo ;
   private boolean n8525PreTAITpo ;
   private boolean n8524PreTAIDto ;
   private boolean n8523PreTAIImp ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P039L2_A396EmprCod ;
   private int[] P039L2_A252CliCod ;
   private short[] P039L2_A8521PreTAICod ;
   private String[] P039L4_A396EmprCod ;
   private int[] P039L4_A252CliCod ;
   private short[] P039L4_A8521PreTAICod ;
   private String[] P039L4_A8525PreTAITpo ;
   private boolean[] P039L4_n8525PreTAITpo ;
   private java.math.BigDecimal[] P039L4_A8524PreTAIDto ;
   private boolean[] P039L4_n8524PreTAIDto ;
   private java.math.BigDecimal[] P039L4_A8523PreTAIImp ;
   private boolean[] P039L4_n8523PreTAIImp ;
   private byte[] P039L4_A583IntCod ;
}

final  class pduppret__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039L2", "SELECT EmprCod, CliCod, PreTAICod FROM TXPPRETAI WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039L3", "INSERT INTO TXPPRETAI(EmprCod, CliCod, PreTAICod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETAI")
         ,new ForEachCursor("P039L4", "SELECT EmprCod, CliCod, PreTAICod, PreTAITpo, PreTAIDto, PreTAIImp, IntCod FROM TXPPRETA1 WHERE EmprCod = ? and CliCod = ? and PreTAICod = ? ORDER BY EmprCod, CliCod, PreTAICod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039L5", "INSERT INTO TXPPRETA1(EmprCod, CliCod, PreTAICod, IntCod, PreTAIImp, PreTAIDto, PreTAITpo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETA1")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               return;
      }
   }

}

