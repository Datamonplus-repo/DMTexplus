package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnprovprdtccstks", "/app.tnprovprdtccstks"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnprovprdtccstks extends GXWebObjectStub
{
   public tnprovprdtccstks( )
   {
   }

   public tnprovprdtccstks( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnprovprdtccstks.class ));
   }

   public tnprovprdtccstks( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnprovprdtccstks_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnprovprdtccstks_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tn PROVPRDTCCSTKS";
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

