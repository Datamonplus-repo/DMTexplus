package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.topbccf", "/app.topbccf"})
@jakarta.servlet.annotation.MultipartConfig
public final  class topbccf extends GXWebObjectStub
{
   public topbccf( )
   {
   }

   public topbccf( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( topbccf.class ));
   }

   public topbccf( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new topbccf_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new topbccf_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OP_Costes_Detail";
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

