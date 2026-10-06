package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talrpme", "/app.talrpme"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talrpme extends GXWebObjectStub
{
   public talrpme( )
   {
   }

   public talrpme( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talrpme.class ));
   }

   public talrpme( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talrpme_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talrpme_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Defectos de Piezas (Mtrs)";
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

