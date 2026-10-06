package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordmrgeneral", "/app.tmordmrgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordmrgeneral extends GXWebObjectStub
{
   public tmordmrgeneral( )
   {
   }

   public tmordmrgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordmrgeneral.class ));
   }

   public tmordmrgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordmrgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordmrgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd MRGeneral";
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

