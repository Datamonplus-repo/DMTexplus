package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmprec", "/app.tmprec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprec extends GXWebObjectStub
{
   public tmprec( )
   {
   }

   public tmprec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprec.class ));
   }

   public tmprec( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MPRec";
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

