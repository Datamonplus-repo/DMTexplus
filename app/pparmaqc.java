package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparmaqc extends GXProcedure
{
   public pparmaqc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparmaqc.class ), "" );
   }

   public pparmaqc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      pparmaqc.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pparmaqc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparmaqc.this.AV10MaqCod = aP1[0];
      this.aP1 = aP1;
      pparmaqc.this.A456FasActTin = aP2[0];
      this.aP2 = aP2;
      pparmaqc.this.A4343FasEstamp = aP3[0];
      this.aP3 = aP3;
      pparmaqc.this.AV8OK = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl1 = (byte)(0) ;
      /* Using cursor P037B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P037B2_A602MaqCod[0] ;
         A1142MaqFCod = P037B2_A1142MaqFCod[0] ;
         AV13GXLvl1 = (byte)(1) ;
         AV9FasCod = A1142MaqFCod ;
         /* Execute user subroutine: 'FASE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl1 == 0 )
      {
         AV8OK = (byte)(-1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'FASE' Routine */
      returnInSub = false ;
      AV14GXLvl10 = (byte)(0) ;
      /* Using cursor P037B3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV9FasCod, Boolean.valueOf(n456FasActTin), A456FasActTin, Boolean.valueOf(n4343FasEstamp), A4343FasEstamp});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P037B3_A457FasCod[0] ;
         AV14GXLvl10 = (byte)(1) ;
         AV8OK = (byte)(1) ;
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV14GXLvl10 == 0 )
      {
         AV8OK = (byte)(0) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparmaqc.this.A396EmprCod;
      this.aP1[0] = pparmaqc.this.AV10MaqCod;
      this.aP2[0] = pparmaqc.this.A456FasActTin;
      this.aP3[0] = pparmaqc.this.A4343FasEstamp;
      this.aP4[0] = pparmaqc.this.AV8OK;
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
      P037B2_A396EmprCod = new String[] {""} ;
      P037B2_A602MaqCod = new String[] {""} ;
      P037B2_A1142MaqFCod = new String[] {""} ;
      A602MaqCod = "" ;
      A1142MaqFCod = "" ;
      AV9FasCod = "" ;
      P037B3_A396EmprCod = new String[] {""} ;
      P037B3_A456FasActTin = new String[] {""} ;
      P037B3_n456FasActTin = new boolean[] {false} ;
      P037B3_A4343FasEstamp = new String[] {""} ;
      P037B3_n4343FasEstamp = new boolean[] {false} ;
      P037B3_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparmaqc__default(),
         new Object[] {
             new Object[] {
            P037B2_A396EmprCod, P037B2_A602MaqCod, P037B2_A1142MaqFCod
            }
            , new Object[] {
            P037B3_A396EmprCod, P037B3_A456FasActTin, P037B3_n456FasActTin, P037B3_A4343FasEstamp, P037B3_n4343FasEstamp, P037B3_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8OK ;
   private byte AV13GXLvl1 ;
   private byte AV14GXLvl10 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV10MaqCod ;
   private String A456FasActTin ;
   private String A4343FasEstamp ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A1142MaqFCod ;
   private String AV9FasCod ;
   private String A457FasCod ;
   private boolean returnInSub ;
   private boolean n456FasActTin ;
   private boolean n4343FasEstamp ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P037B2_A396EmprCod ;
   private String[] P037B2_A602MaqCod ;
   private String[] P037B2_A1142MaqFCod ;
   private String[] P037B3_A396EmprCod ;
   private String[] P037B3_A456FasActTin ;
   private boolean[] P037B3_n456FasActTin ;
   private String[] P037B3_A4343FasEstamp ;
   private boolean[] P037B3_n4343FasEstamp ;
   private String[] P037B3_A457FasCod ;
}

final  class pparmaqc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037B2", "SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037B3", "SELECT * FROM (SELECT EmprCod, FasActTin, FasEstamp, FasCod FROM TXPFASPRO WHERE (EmprCod = ? and FasCod = ?) AND (FasActTin = ?) AND (FasEstamp = ?) ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 1);
               }
               return;
      }
   }

}

