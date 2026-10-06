package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisnorww", "/app.tdisnorww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisnorww extends GXWebObjectStub
{
   public tdisnorww( )
   {
   }

   public tdisnorww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisnorww.class ));
   }

   public tdisnorww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisnorww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisnorww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Normas";
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

