package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn07", "/app.ttrn07"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn07 extends GXWebObjectStub
{
   public ttrn07( )
   {
   }

   public ttrn07( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn07.class ));
   }

   public ttrn07( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn07_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn07_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guias (Detail HDRs)";
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

