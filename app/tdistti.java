package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdistti", "/app.tdistti"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdistti extends GXWebObjectStub
{
   public tdistti( )
   {
   }

   public tdistti( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdistti.class ));
   }

   public tdistti( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdistti_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdistti_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tratamientos Tinte";
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

