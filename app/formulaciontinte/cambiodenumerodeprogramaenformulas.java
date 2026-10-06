package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cambiodenumerodeprogramaenformulas", "/app.formulaciontinte.cambiodenumerodeprogramaenformulas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cambiodenumerodeprogramaenformulas extends GXWebObjectStub
{
   public cambiodenumerodeprogramaenformulas( )
   {
   }

   public cambiodenumerodeprogramaenformulas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cambiodenumerodeprogramaenformulas.class ));
   }

   public cambiodenumerodeprogramaenformulas( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cambiodenumerodeprogramaenformulas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cambiodenumerodeprogramaenformulas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Formulas de Color";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

