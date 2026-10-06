package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajoexterno_detail___wc", "/app.trabajoexterno_detail___wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_detail___wc extends GXWebObjectStub
{
   public trabajoexterno_detail___wc( )
   {
   }

   public trabajoexterno_detail___wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_detail___wc.class ));
   }

   public trabajoexterno_detail___wc( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_detail___wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_detail___wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " EXHDPZ";
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

