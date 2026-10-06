package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisdef", "/app.tdisdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisdef extends GXWebObjectStub
{
   public tdisdef( )
   {
   }

   public tdisdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisdef.class ));
   }

   public tdisdef( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DEFECTOS DISPOSICION";
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

