package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0009a", "/app.rst0009a"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0009a extends GXWebObjectStub
{
   public rst0009a( )
   {
   }

   public rst0009a( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0009a.class ));
   }

   public rst0009a( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0009a_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0009a_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC STK c-PreMed y PreUni";
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

