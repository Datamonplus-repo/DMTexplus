package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedar10 extends GXProcedure
{
   public ppedar10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedar10.class ), "" );
   }

   public ppedar10( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 ,
                               int[] aP1 ,
                               int[] aP2 )
   {
      AV8AlbRecPie = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV8AlbRecPie[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, aP2, AV8AlbRecPie);
      return AV8AlbRecPie;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] AV8AlbRecPie )
   {
      execute_int(aP0, aP1, aP2, AV8AlbRecPie);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] AV8AlbRecPie )
   {
      ppedar10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedar10.this.A8197PArId = aP1[0];
      this.aP1 = aP1;
      ppedar10.this.A8226PArCruRec = aP2[0];
      this.aP2 = aP2;
      ppedar10.this.AV8AlbRecPie = AV8AlbRecPie;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03E82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Boolean.valueOf(n8226PArCruRec), Integer.valueOf(A8226PArCruRec)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8229PArCruPie = P03E82_A8229PArCruPie[0] ;
         n8229PArCruPie = P03E82_n8229PArCruPie[0] ;
         A8225ParCruLin = P03E82_A8225ParCruLin[0] ;
         AV9Cont = AV9Cont.add(DecimalUtil.doubleToDec(1)) ;
         AV8AlbRecPie[(int)(DecimalUtil.decToDouble(AV9Cont))-1] = A8229PArCruPie ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedar10.this.A396EmprCod;
      this.aP1[0] = ppedar10.this.A8197PArId;
      this.aP2[0] = ppedar10.this.A8226PArCruRec;
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
      P03E82_A396EmprCod = new String[] {""} ;
      P03E82_A8197PArId = new int[1] ;
      P03E82_A8226PArCruRec = new int[1] ;
      P03E82_n8226PArCruRec = new boolean[] {false} ;
      P03E82_A8229PArCruPie = new String[] {""} ;
      P03E82_n8229PArCruPie = new boolean[] {false} ;
      P03E82_A8225ParCruLin = new short[1] ;
      A8229PArCruPie = "" ;
      AV9Cont = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedar10__default(),
         new Object[] {
             new Object[] {
            P03E82_A396EmprCod, P03E82_A8197PArId, P03E82_A8226PArCruRec, P03E82_n8226PArCruRec, P03E82_A8229PArCruPie, P03E82_n8229PArCruPie, P03E82_A8225ParCruLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8225ParCruLin ;
   private short Gx_err ;
   private int GX_I ;
   private int A8197PArId ;
   private int A8226PArCruRec ;
   private java.math.BigDecimal AV9Cont ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A8229PArCruPie ;
   private boolean n8226PArCruRec ;
   private boolean n8229PArCruPie ;
   private String[] AV8AlbRecPie ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03E82_A396EmprCod ;
   private int[] P03E82_A8197PArId ;
   private int[] P03E82_A8226PArCruRec ;
   private boolean[] P03E82_n8226PArCruRec ;
   private String[] P03E82_A8229PArCruPie ;
   private boolean[] P03E82_n8229PArCruPie ;
   private short[] P03E82_A8225ParCruLin ;
}

final  class ppedar10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03E82", "SELECT EmprCod, PArId, PArCruRec, PArCruPie, ParCruLin FROM TXPPedAr1 WHERE (EmprCod = ? and PArId = ?) AND (PArCruRec = ?) ORDER BY EmprCod, PArId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
      }
   }

}

