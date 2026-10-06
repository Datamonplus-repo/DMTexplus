package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rregqua", "/app.rregqua"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rregqua extends GXWebObjectStub
{
   public rregqua( )
   {
   }

   public rregqua( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rregqua.class ));
   }

   public rregqua( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rregqua_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rregqua_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Registo de Qualidade Moda21";
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

