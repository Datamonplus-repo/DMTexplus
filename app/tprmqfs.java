package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprmqfs", "/app.tprmqfs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprmqfs extends GXWebObjectStub
{
   public tprmqfs( )
   {
   }

   public tprmqfs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprmqfs.class ));
   }

   public tprmqfs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprmqfs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprmqfs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FASE-MAQUINA-PARAMETROS";
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

