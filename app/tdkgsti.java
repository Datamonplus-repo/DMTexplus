package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdkgsti", "/app.tdkgsti"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdkgsti extends GXWebObjectStub
{
   public tdkgsti( )
   {
   }

   public tdkgsti( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdkgsti.class ));
   }

   public tdkgsti( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdkgsti_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdkgsti_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "KILOS TINTADOS";
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

