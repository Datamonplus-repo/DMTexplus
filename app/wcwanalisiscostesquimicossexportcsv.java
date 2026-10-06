package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwanalisiscostesquimicossexportcsv", "/app.wcwanalisiscostesquimicossexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwanalisiscostesquimicossexportcsv extends GXWebObjectStub
{
   public wcwanalisiscostesquimicossexportcsv( )
   {
   }

   public wcwanalisiscostesquimicossexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwanalisiscostesquimicossexportcsv.class ));
   }

   public wcwanalisiscostesquimicossexportcsv( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwanalisiscostesquimicossexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwanalisiscostesquimicossexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWAnalisis Costes Quimicoss Export CSV";
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

